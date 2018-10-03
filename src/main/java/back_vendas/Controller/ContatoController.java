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

import back_vendas.model.Contato;
import back_vendas.service.ContatoService;

@RestController
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	@CrossOrigin("*")
	@GetMapping("/contatos")
	public List<Contato> buscarTodos(){
		return contatoService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/contatos")
	public void salvar(@RequestBody Contato contato){
		contatoService.create(contato);
	}
	@CrossOrigin("*")
	@PutMapping("/contatos")
	public void alterar(@RequestBody Contato contato){
		contatoService.create(contato);
	}
	@CrossOrigin("*")
	@DeleteMapping("/contatos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		contatoService.delete(id);
	}


}
