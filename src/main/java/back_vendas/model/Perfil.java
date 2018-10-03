package back_vendas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_perfil")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Perfil extends GenericModel{
	
	private BigDecimal valorDecimal;
	private BigDecimal valorAcessorio;
	private BigDecimal valorTotal;
	private String observacao;
	private Date dataEmissao;
	private Date dataValidade;
	@ManyToOne
	private Atendimento atendimento;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Acessorios acessorios;

}
