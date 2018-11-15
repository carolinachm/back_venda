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

import back_vendas.model.Cliente;
import back_vendas.service.ClienteService;


@RestController
@CrossOrigin("*")
public class ClienteController {
	
		
	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin("*")
	@GetMapping("/clientes")
	public List<Cliente> buscarTodos(){
		return clienteService.list();
	}
	@CrossOrigin("*")
	@GetMapping("/clientes/{cpf}")
	public void buscarClientePorCPF(@PathVariable("cpf") String cpf){
		clienteService.buscarClientePorCPF(cpf);
	}
	@CrossOrigin("*")
	@PostMapping("/clientes")
	public void salvar(@RequestBody Cliente cliente){
		clienteService.salvar(cliente);
	}
	@CrossOrigin("*")
	@PutMapping("/clientes")
	public void alterar(@RequestBody Cliente cliente){
		clienteService.create(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	@CrossOrigin("*")
	public void remover(@PathVariable("id") long id){
		clienteService.delete(id);
	}
}
