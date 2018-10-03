package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_modelo")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Modelo extends GenericModel{
	
	private String descricao;
	private char inativo;
	@ManyToOne
	private Acessorios acessorios;
	

}
