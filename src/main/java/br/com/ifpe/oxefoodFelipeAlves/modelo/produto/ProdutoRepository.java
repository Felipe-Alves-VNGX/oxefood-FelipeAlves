package br.com.ifpe.oxefoodFelipeAlves.modelo.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.Cliente;

public interface ProdutoRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {

}

