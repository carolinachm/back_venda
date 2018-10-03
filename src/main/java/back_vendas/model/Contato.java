package back_vendas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_contato")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contato extends GenericModel {
	
	private Date dataContato;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Atendimento atendimento;

}
