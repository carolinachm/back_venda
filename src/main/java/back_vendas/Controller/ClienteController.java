package back_vendas.Controller;

import back_vendas.model.Cliente;
import back_vendas.repository.ClienteRepository;
import back_vendas.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@RestController
public class ClienteController {
    
	@Autowired
	private ClienteService clienteService;
	@CrossOrigin("*")
	@GetMapping("/clientes")
	public List<Cliente> buscarTodos(){
		return clienteService.list();
	}
	@CrossOrigin("*")
	@PostMapping("/clientes")
	public void salvar(@RequestBody Cliente cliente){
		System.out.println("Chamou o metodo post");
		clienteService.create(cliente);
	}
	@CrossOrigin("*")
	@PutMapping("/clientes")
	public void alterar(@RequestBody Cliente cliente){
		clienteService.create(cliente);
	}
	@CrossOrigin("*")
	@DeleteMapping("/clientes/{id}")
	public void remover(@PathVariable(value = "id") long id){
		clienteService.delete(id);
	}
}
