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

import back_vendas.model.Orcamento;
import back_vendas.service.OrcamentoService;

@RestController
public class OrcamentoController {
	
	@Autowired
	private OrcamentoService orcamentoService;
	@GetMapping("/orcamentos")
	public List<Orcamento> buscarTodos(){
		return orcamentoService.list();
	}
	@PostMapping("/orcamentos")
	public void salvar(@RequestBody Orcamento orcamento){
		orcamentoService.create(orcamento);
	}
	@PutMapping("/orcamentos")
	public void alterar(@RequestBody Orcamento orcamento){
		orcamentoService.create(orcamento);
	}
	@DeleteMapping("/orcamentos")
	public void remover(@PathVariable(value = "id") long id){
		orcamentoService.delete(id);;
	}

}
