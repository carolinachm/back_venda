package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produto")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@EqualsAndHashCode
public class Produto extends GenericModel{
	
	private String marca;
	private int potencia;
	private String desempenho;
	private String tipoCor;
	private int capacidade;
	private String placa;
	private String modelo;
	private String categoria;
	@ManyToOne
	private Vendedor vendedor;
	
}
