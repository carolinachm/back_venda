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

import back_vendas.model.Veiculo;
import back_vendas.service.VeiculoService;

@RestController
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping("/veiculos")
	public List<Veiculo> buscarTodos(){
		return veiculoService.list();
	}
	@PostMapping("/veiculos")
	public void salvar(@RequestBody Veiculo venda){
		veiculoService.create(venda);
	}
	@PutMapping("/veiculos")
	public void alterar(@RequestBody Veiculo venda){
		veiculoService.create(venda);
	}
	@DeleteMapping("/veiculos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		veiculoService.delete(id);
	}


}
