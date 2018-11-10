package back_vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import back_vendas.model.Cliente;
import back_vendas.repository.ClienteRepository;


/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Service
public class ClienteService extends GenericService<Cliente> {
	@Autowired
	private final ClienteRepository clienteRepository;
   
    public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente salvar(@RequestBody Cliente cliente){
    	return clienteRepository.saveAndFlush(cliente);
    }
	public Cliente buscarClientePorCPF(String cpf){
		return clienteRepository.buscarClientePorCPF(cpf);
	}

}
