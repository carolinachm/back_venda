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

import back_vendas.model.Acessorios;
import back_vendas.model.Vendedor;
import back_vendas.service.AcessoriosService;
import back_vendas.service.VendedorService;



@RestController
public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService;
	@CrossOrigin("*")
	@GetMapping("/vendedores")
	public List<Vendedor> buscarTodos(){
		return vendedorService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/vendedores")
	public void salvar(@RequestBody Vendedor vendedor){
		vendedorService.create(vendedor);
	}
	@CrossOrigin("*")
	@PutMapping("/vendedores")
	public void alterar(@RequestBody Vendedor vendedor){
		vendedorService.create(vendedor);
	}
	@CrossOrigin("*")
	@DeleteMapping("/vendedores/{id}")
	public void remover(@PathVariable("id") long id){
		vendedorService.delete(id);
	}

}
