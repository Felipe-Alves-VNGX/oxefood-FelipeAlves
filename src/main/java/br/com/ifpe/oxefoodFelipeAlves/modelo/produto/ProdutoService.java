package br.com.ifpe.oxefoodFelipeAlves.modelo.produto;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.Cliente;
import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.ClienteRepository;
import br.com.ifpe.oxefoodFelipeAlves.util.entity.GenericService;
@Service
public class ProdutoService extends GenericService {
    
    @Autowired
    private ProdutoRepository repository;

    @Transactional
    public Produto save(Produto produto) {

    super.preencherCamposAuditoria(produto);

    return repository.save(produto);
    }
}
