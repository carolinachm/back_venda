package back_vendas.repository;

import back_vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
