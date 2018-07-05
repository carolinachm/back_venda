package back_vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
public interface GenericRepository <T, ID extends Serializable> extends JpaRepository<T, ID> {
}
