package back_vendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Modelo;
import back_vendas.service.ModeloService;

@RestController
public class ModeloController {
	
	@Autowired
	private ModeloService modeloService;
	
	@GetMapping("/modelos")
	public List<Modelo> buscarTodos(){
		return modeloService.list();
	}
	@PostMapping("/modelos")
	public void salvar(@RequestBody Modelo modelo){
		modeloService.create(modelo);
	}
	@PutMapping("/modelos")
	public void alterar(@RequestBody Modelo modelo){
		modeloService.create(modelo);
	}
	@DeleteMapping("/modelos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		modeloService.delete(id);
	}

}
