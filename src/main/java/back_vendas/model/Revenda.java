package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_revenda")
public class Revenda extends GenericModel{
	@ManyToOne
	private Atendimento atendimento;
}
