package back_vendas.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_perfil")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Perfil extends GenericModel {
	
	
	@ManyToOne
	private Cliente cliente;
	
}
