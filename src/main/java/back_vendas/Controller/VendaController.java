package back_vendas.Controller;

import back_vendas.model.Venda;
import back_vendas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda salvar(@RequestBody @Valid Venda venda){
        return vendaService.salvar(venda);
    }
}
