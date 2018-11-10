package back_vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import back_vendas.model.Cliente;
import back_vendas.model.Perfil;
import back_vendas.repository.ClienteRepository;

@Service
public class PerfilService  extends GenericService<Perfil>{
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscarClientePorCPF(String cpf) {
		return clienteRepository.buscarClientePorCPF(cpf);
	}
	
}
