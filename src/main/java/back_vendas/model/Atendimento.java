package back_vendas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_atendimento")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Atendimento extends GenericModel {
	
	private Date dataAbertura;
	private Date dataEncerramento;
	private String nome;
	private String telefone;
	private String email;
	private char status;
	private String descricao;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Revenda revenda;

}
