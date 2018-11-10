package back_vendas.repository;

import back_vendas.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends GenericRepository<Cliente> {
	@Query("SELECT c FROM Cliente c WHERE c.cpf =:cpf")
	public Cliente buscarClientePorCPF(@Param("cpf") String cpf);
}
