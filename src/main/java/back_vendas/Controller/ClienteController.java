package back_vendas.Controller;

import back_vendas.model.Cliente;
import back_vendas.repository.ClienteRepository;
import back_vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public List<Cliente> buscarTodos(){
       return clienteService.buscarTodos();
    }
    @PostMapping
    public void salvar(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
    }

}
