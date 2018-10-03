package back_vendas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_atendimento")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Atendimento extends GenericModel {
	
	private Date dataAbertura = new Date();
	private Date dataEncerramento = new Date();
	private String nome;
	private String telefone;
	private String email;
	private Boolean status;
	private String descricao;
	@OneToMany(mappedBy = "atendimento", fetch = FetchType.LAZY)
	private List<Usuario> usuarios;
	@ManyToOne
	private Revenda revenda;

}
