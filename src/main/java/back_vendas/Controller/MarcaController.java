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

import back_vendas.model.Marca;
import back_vendas.service.AcessoriosService;
import back_vendas.service.MarcaService;

@RestController
@CrossOrigin("*")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/marcas")
	public List<Marca> buscarTodos(){
		return marcaService.list();
	}
	
	@PostMapping("/marcas")
	public void salvar(@RequestBody Marca marca){
		marcaService.create(marca);
	}
	
	@PutMapping("/marcas")
	public void alterar(@RequestBody Marca marca){
		marcaService.create(marca);
	}
	
	@DeleteMapping("/marcas/{id}")
	public void remover(@PathVariable(value = "id") long id){
		marcaService.delete(id);
	}

}
