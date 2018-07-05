package back_vendas.service;

import back_vendas.model.Cliente;
import back_vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
    public void salvar (Cliente cliente){
        clienteRepository.save(cliente);
    }
    public void alterar (Cliente cliente){
        clienteRepository.save(cliente);
    }
    public void remover(Cliente cliente){
        clienteRepository.delete(cliente);
    }
    public Cliente buscarPorId(Long id){
        return clienteRepository.getOne(id);
    }

}
