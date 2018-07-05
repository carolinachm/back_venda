package back_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name = "tb_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Item extends GenericModel {

    @ManyToOne
    private Venda venda;
    @NotNull
    @ManyToOne
    private Produto produto;
    @NotNull
    private Integer quantidade;
}
