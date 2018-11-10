package back_vendas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_veiculo")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Veiculo extends GenericModel {
	
	
	private String marca;
	private String desempenho;
	private String tipoCor;
	private int capacidade;
	private int potencia;
	private String placa;
	private String modelo;
	private String categoria;
	private String imgVeiculo;

}
