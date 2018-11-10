package back_vendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Cliente;
import back_vendas.model.Perfil;
import back_vendas.service.PerfilService;

@RestController
@CrossOrigin("*")
public class PerfilController {
	
	@Autowired
	private PerfilService perfilService;

	@GetMapping("/perfis")
	public List<Perfil> buscarTodos(){
		return perfilService.list();
	}
	@GetMapping("/perfis/{cpf}")
	public Cliente buscarClientePorCPF(@PathVariable("cpf") String cpf){
		return perfilService.buscarClientePorCPF(cpf);
	}
	
	@PostMapping("/perfis")
	public void salvar(@RequestBody Perfil perfil){
		perfilService.create(perfil);
	}
	
	@PutMapping("/perfis")
	public void alterar(@RequestBody Perfil perfil){
		perfilService.create(perfil);
	}
	
	@DeleteMapping("/perfis/{id}")
	public void remover(@PathVariable("id") long id){
		perfilService.delete(id);;
	}

}
