package back_vendas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_venda")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Venda extends GenericModel{
	
	private BigDecimal valorVenda;
	@ManyToOne
	private Vendedor vendedor;
	@ManyToOne
	private Cliente cliente;
	private Date dataVenda;
	@ManyToOne
	private Produto produto;

}
