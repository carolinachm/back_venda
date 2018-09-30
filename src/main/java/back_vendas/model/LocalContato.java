package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_local")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LocalContato extends GenericModel {
	
	private String descricao;
	private char ativo;

}
