package back_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name = "tb_produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends GenericModel {

    private String nome;
    private BigDecimal valor;
}
