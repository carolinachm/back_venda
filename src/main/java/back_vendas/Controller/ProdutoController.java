package back_vendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Produto;
import back_vendas.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	@CrossOrigin("*")
	@GetMapping("/produtos")
	public List<Produto> buscarTodos(){
		return produtoService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/produtos")
	public void salvar(@RequestBody Produto produto){
		produtoService.create(produto);
	}
	@CrossOrigin("*")
	@PutMapping("/produtos")
	public void alterar(@RequestBody Produto produto){
		produtoService.create(produto);
	}
	@CrossOrigin("*")
	@DeleteMapping("/produtos/{id}")
	public void remover(@PathVariable("id") long id){
		produtoService.delete(id);
	}

}
