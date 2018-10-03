package back_vendas.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Atendimento;
import back_vendas.model.Usuario;
import back_vendas.service.AtendimentoService;
import back_vendas.service.UsuarioService;

@RestController
public class AtendimentoController {
	
	@Getter@Setter
	private Atendimento atendimento = new Atendimento();
	@Getter@Setter
	private List<Atendimento> atendimentos;
	@Getter@Setter
	private List<Usuario> usuarios;
	@Autowired
	private AtendimentoService atendimentoService;
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostConstruct
	public void init(){
		atendimentos = atendimentoService.list();
		usuarios = usuarioService.list();
	}
	@CrossOrigin("*")
	@GetMapping("/atendimentos")
	public List<Atendimento> buscarTodos(){
		return atendimentoService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/atendimentos")
	public void salvar(@RequestBody Atendimento atendimento){
		atendimentoService.create(atendimento);
	}
	@CrossOrigin("*")
	@PutMapping("/atendimentos")
	public void alterar(@RequestBody Atendimento atendimento){
		atendimentoService.create(atendimento);
	}
	@CrossOrigin("*")
	@DeleteMapping("/atendimentos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		atendimentoService.delete(id);
	}

}
