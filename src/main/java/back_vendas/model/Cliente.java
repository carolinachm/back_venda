package back_vendas.model;

import back_vendas.enumerador.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name="tb_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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

}
