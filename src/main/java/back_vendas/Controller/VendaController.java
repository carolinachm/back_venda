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

import back_vendas.model.Venda;
import back_vendas.service.VendaService;

@RestController
@CrossOrigin("*")
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@CrossOrigin("*")
	@GetMapping("/vendas")
	public List<Venda> buscarTodos(){
		return vendaService.list();
	}
	
	@CrossOrigin("*")
	@PostMapping("/vendas")
	public void salvar(@RequestBody Venda venda){
		vendaService.create(venda);
	}
	@CrossOrigin("*")
	@PutMapping("/vendas")
	public void alterar(@RequestBody Venda venda){
		vendaService.create(venda);
	}
	
	@DeleteMapping("/vendas/{id}")
	@CrossOrigin("*")
	public void remover(@PathVariable("id") long id){
		vendaService.delete(id);
	}

}
