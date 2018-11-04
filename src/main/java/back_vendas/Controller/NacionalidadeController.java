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

import back_vendas.model.Nacionalidade;
import back_vendas.service.AcessoriosService;
import back_vendas.service.MarcaService;
import back_vendas.service.NacionalidadeService;

@RestController
@CrossOrigin("*")
public class NacionalidadeController {
	
	@Autowired
	private NacionalidadeService nacionalidadeService;
	
	@GetMapping("/nacionalidades")
	public List<Nacionalidade> buscarTodos(){
		return nacionalidadeService.list();
	}
	
	@PostMapping("/nacionalidades")
	public void salvar(@RequestBody Nacionalidade nacionalidade){
		nacionalidadeService.create(nacionalidade);
	}
	
	@PutMapping("/nacionalidades")
	public void alterar(@RequestBody Nacionalidade nacionalidade){
		nacionalidadeService.create(nacionalidade);
	}
	
	@DeleteMapping("/nacionalidades/{id}")
	public void remover(@PathVariable(value = "id") long id){
		nacionalidadeService.delete(id);
	}

}
