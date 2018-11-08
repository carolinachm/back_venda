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
import back_vendas.service.AcessoriosService;



@RestController
public class AcessoriosController {
	
	@Autowired
	private AcessoriosService acessoriosService;
	@CrossOrigin("*")
	@GetMapping("/acessorios")
	public List<Acessorios> buscarTodos(){
		return acessoriosService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/acessorios")
	public void salvar(@RequestBody Acessorios acessorios){
		acessoriosService.create(acessorios);
	}
	@CrossOrigin("*")
	@PutMapping("/acessorios")
	public void alterar(@RequestBody Acessorios acessorios){
		acessoriosService.create(acessorios);
	}
	@CrossOrigin("*")
	@DeleteMapping("/acessorios/{id}")
	public void remover(@PathVariable("id") long id){
		acessoriosService.delete(id);
	}

}
