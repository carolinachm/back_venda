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
	
	@ManyToOne
	private Produto produto;
	@ManyToOne
	private Vendedor vendedor;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Perfil perfil;
	private String descricao;
	private Boolean situacao;
	
}
