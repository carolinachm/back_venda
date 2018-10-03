package back_vendas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_veiculo")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Veiculo extends GenericModel {
	
	private String chassi;
	private String placa;
	private BigDecimal valorEstoque;
	@ManyToOne
	private Modelo modelo;

}
