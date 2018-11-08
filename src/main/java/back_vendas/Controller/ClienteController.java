package back_vendas.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

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
import back_vendas.model.Cliente;
import back_vendas.service.AcessoriosService;
import back_vendas.service.ClienteService;
import back_vendas.service.MarcaService;
import back_vendas.service.TipoVeiculoService;


@RestController
@CrossOrigin("*")
public class ClienteController {
	
		
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/clientes")
	public List<Cliente> buscarTodos(){
		return clienteService.list();
	}
	
	@PostMapping("/clientes")
	public void salvar(@RequestBody Cliente cliente){
		clienteService.salvar(cliente);
	}
	
	@PutMapping("/clientes")
	public void alterar(@RequestBody Cliente cliente){
		clienteService.create(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void remover(@PathVariable(value = "id") long id){
		clienteService.delete(id);
	}
}
