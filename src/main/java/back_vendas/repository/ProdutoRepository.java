package back_vendas.repository;

import back_vendas.model.Produto;
import org.springframework.stereotype.Repository;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Repository
public interface ProdutoRepository extends GenericRepository<Produto, Long> {


}
