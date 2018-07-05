package back_vendas.Controller;

import back_vendas.model.Produto;
import back_vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@RequestMapping("/produtos")
@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    @GetMapping
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }
    @PostMapping
    public void salvar(@RequestBody Produto produto){
        produtoService.salvar(produto);
    }
}
