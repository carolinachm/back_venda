package back_vendas.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import back_vendas.model.GenericModel;

public interface GenericRepository <T extends GenericModel> extends JpaRepository<T, Serializable>{
	
	
}
