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

import back_vendas.model.Usuario;
import back_vendas.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	@CrossOrigin("*")
	@GetMapping("/usuarios")
	public List<Usuario> buscarTodos(){
		return usuarioService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/usuarios")
	public void salvar(@RequestBody Usuario usuario){
		usuarioService.create(usuario);
	}
	@CrossOrigin("*")
	@PutMapping("/usuarios")
	public void alterar(@RequestBody Usuario usuario){
		usuarioService.create(usuario);
	}
	@CrossOrigin("*")
	@DeleteMapping("/usuarios/{id}")
	public void remover(@PathVariable("id") long id){
		usuarioService.delete(id);
	}

}
