package back_vendas.service;

import back_vendas.model.Produto;
import back_vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
    public void salvar(Produto produto){
        produtoRepository.save(produto);
    }
    public Produto buscarPorId(Long id) {
        return produtoRepository.getOne(id);
    }

}
