package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_marca")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Marca extends GenericModel{
	
	private String descricao;

}
