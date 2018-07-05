package back_vendas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Entity
@Table(name = "tb_venda")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Venda extends GenericModel{

    private LocalDateTime cadastro;
    @ManyToOne
    private Cliente cliente;
    @JsonIgnoreProperties("venda")
    @Valid
    @NotEmpty
    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> itens;
    @NotNull
    private BigDecimal frete;

    private BigDecimal total;
}
