package back_vendas.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name="tb_cliente")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente extends GenericModel {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String sexo;
    private String redeSocial;
    @ManyToOne
    private Produto produto;

}
