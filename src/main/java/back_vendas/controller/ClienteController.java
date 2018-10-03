package back_vendas.controller;

import back_vendas.model.Cliente;
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
	
	@GetMapping("/clientes")
	public List<Cliente> buscarTodos(){
		return clienteService.list();
	}
	@PostMapping("/clientes")
	public void salvar(@RequestBody Cliente cliente){
		System.out.println("Chamou o metodo post");
		clienteService.create(cliente);
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
