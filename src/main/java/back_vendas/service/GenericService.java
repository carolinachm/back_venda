package back_vendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import back_vendas.model.GenericModel;
import back_vendas.repository.GenericRepository;



/**
 * Created by Leonardo Candido on 04/07/2018.
 */

public class GenericService <T extends GenericModel>{
	
	@Autowired
	private GenericRepository<T> genericRepository;
	
	public List<T> list() {
		return genericRepository.findAll();
	}
	
	
	public T create(@RequestBody T entity) {
		return genericRepository.save(entity);
	}
	
	
	public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
		return genericRepository.save(entity);
	}
	
	
	public void delete(@PathVariable(value = "id") long id) {
		genericRepository.deleteById(id);

	}
	
	public T get(@PathVariable(value = "id") long id) {
		return genericRepository.getOne(id);
	}

}
