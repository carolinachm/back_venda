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

import back_vendas.model.Perfil;
import back_vendas.service.PerfilService;

@RestController
public class PerfilController {
	
	@Autowired
	private PerfilService perfilService;
	@CrossOrigin("*")
	@GetMapping("/perfis")
	public List<Perfil> buscarTodos(){
		return perfilService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/perfis")
	public void salvar(@RequestBody Perfil perfil){
		perfilService.create(perfil);
	}
	@CrossOrigin("*")
	@PutMapping("/perfis")
	public void alterar(@RequestBody Perfil perfil){
		perfilService.create(perfil);
	}
	@CrossOrigin("*")
	@DeleteMapping("/perfis")
	public void remover(@PathVariable(value = "id") long id){
		perfilService.delete(id);;
	}

}
