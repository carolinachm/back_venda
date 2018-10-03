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
import back_vendas.service.AtendimentoService;

@RestController
public class AtendimentoController {
	
	@Autowired
	private AtendimentoService atendimentoService;
	
	@GetMapping("/atendimentos")
	public List<Atendimento> buscarTodos(){
		return atendimentoService.list();
	}
	@PostMapping("/atendimentos")
	public void salvar(@RequestBody Atendimento atendimento){
		atendimentoService.create(atendimento);
	}
	@PutMapping("/atendimentos")
	public void alterar(@RequestBody Atendimento atendimento){
		atendimentoService.create(atendimento);
	}
	@DeleteMapping("/atendimentos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		atendimentoService.delete(id);
	}

}
