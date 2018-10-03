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
<<<<<<< HEAD
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


=======
public class ClienteService extends GenericService<Cliente>{
  
>>>>>>> 485ba71c5443a348ff678fcf0a1d7148d77190db
}
