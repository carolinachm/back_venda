package back_vendas.model;

<<<<<<< HEAD
import back_vendas.enumerador.TipoCliente;
import lombok.AllArgsConstructor;
=======

>>>>>>> 485ba71c5443a348ff678fcf0a1d7148d77190db
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embedded;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Enumerated;
=======
import javax.persistence.ManyToOne;
>>>>>>> 485ba71c5443a348ff678fcf0a1d7148d77190db
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
		
	private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
<<<<<<< HEAD

=======
    @ManyToOne
    private Atendimento atendimento;
>>>>>>> 485ba71c5443a348ff678fcf0a1d7148d77190db
}
