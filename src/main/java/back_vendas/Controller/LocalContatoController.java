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

import back_vendas.model.Atendimento;
import back_vendas.model.LocalContato;
import back_vendas.service.LocalContatoService;

@RestController
public class LocalContatoController {
	
	@Autowired
	private LocalContatoService localContatoService;
	
	@GetMapping("/local")
	public List<LocalContato> buscarTodos(){
		return localContatoService.list();
	}
	@PostMapping("/local")
	public void salvar(@RequestBody LocalContato localContato){
		localContatoService.create(localContato);
	}
	@PutMapping("/local")
	public void alterar(@RequestBody LocalContato localContato){
		localContatoService.create(localContato);
	}
	@DeleteMapping("/local/{id}")
	public void remover(@PathVariable(value = "id") long id){
		localContatoService.delete(id);
	}

}
