package back_vendas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_acessorio")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Acessorios extends GenericModel{
	
	private String descricao;
	private Boolean status;

}
