package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario extends GenericModel{
	
	private String login;
	private String senha;
	private Boolean vendedor = false;
	private Boolean ativo;
	

}
