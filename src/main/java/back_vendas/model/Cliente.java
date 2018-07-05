package back_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name = "tb_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends GenericModel {

    private String nome;
    private String cpf;
}
