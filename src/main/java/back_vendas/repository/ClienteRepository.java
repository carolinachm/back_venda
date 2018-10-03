package back_vendas.repository;

import back_vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
<<<<<<< HEAD

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
=======
@Repository
public interface ClienteRepository extends GenericRepository<Cliente> {
>>>>>>> 485ba71c5443a348ff678fcf0a1d7148d77190db
}
