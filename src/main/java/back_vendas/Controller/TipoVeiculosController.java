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

import back_vendas.model.Acessorios;
import back_vendas.model.TipoVeiculo;
import back_vendas.service.AcessoriosService;
import back_vendas.service.TipoVeiculoService;

@RestController
public class TipoVeiculosController {
	
	@Autowired
	private TipoVeiculoService tipoVeiculoService;
	@CrossOrigin("*")
	@GetMapping("/tipoVeiculos")
	public List<TipoVeiculo> buscarTodos(){
		return tipoVeiculoService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/tipoVeiculos")
	public void salvar(@RequestBody TipoVeiculo tipoVeiculo){
		tipoVeiculoService.create(tipoVeiculo);
	}
	@CrossOrigin("*")
	@PutMapping("/tipoVeiculos")
	public void alterar(@RequestBody TipoVeiculo tipoVeiculo){
		tipoVeiculoService.create(tipoVeiculo);
	}
	@CrossOrigin("*")
	@DeleteMapping("/tipoVeiculos/{id}")
	public void remover(@PathVariable("id") long id){
		tipoVeiculoService.delete(id);
	}

}
