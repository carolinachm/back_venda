package back_vendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Revenda;
import back_vendas.service.RevendaService;

@RestController
public class RevendaController {
	
	@Autowired
	private RevendaService revendaService;
	@GetMapping("/revenda")
	public List<Revenda> buscarTodos(){
		return revendaService.list();
	}
	@PostMapping("/revenda")
	public void salvar(@RequestBody Revenda revenda){
		revendaService.create(revenda);
	}
	@PutMapping("/revenda")
	public void alterar(@RequestBody Revenda revenda){
		revendaService.create(revenda);
	}
	@DeleteMapping("/revenda/{id}")
	public void remove(@PathVariable("id") long id){
		revendaService.delete(id);
	}

}
