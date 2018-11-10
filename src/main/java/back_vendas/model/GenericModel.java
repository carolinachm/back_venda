package back_vendas.model;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Data
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericModel implements Serializable{
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)  
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")  
    private long id;
}
