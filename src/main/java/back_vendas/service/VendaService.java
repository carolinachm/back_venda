package back_vendas.service;

import back_vendas.model.Item;
import back_vendas.model.Venda;
import back_vendas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Service
public class VendaService  {
    @Autowired
    private VendaRepository vendaRepository;
    @Autowired
    private ProdutoService produtoService;

    public List<Venda> buscarTodos(){
        return vendaRepository.findAll();
    }
    public Venda salvar(Venda venda){
        venda.setCadastro(LocalDateTime.now());
        venda.getItens().forEach((Item i) ->{
            i.setVenda(venda);
            i.setProduto(produtoService.buscarPorId(i.getProduto().getId()));
        });
        BigDecimal totalItens = venda.getItens().stream()
                .map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        venda.setTotal(totalItens.add(venda.getFrete()));
        return vendaRepository.save(venda);
    }
}
