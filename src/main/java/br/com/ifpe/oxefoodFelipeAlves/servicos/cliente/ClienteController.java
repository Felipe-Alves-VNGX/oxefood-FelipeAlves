package br.com.ifpe.oxefoodFelipeAlves.servicos.cliente;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.Cliente;
import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.ClienteService;
import br.com.ifpe.oxefoodFelipeAlves.util.entity.GenericController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends GenericController{
	@Autowired
	private ClienteService clienteService;
	@ApiOperation(value="Serviço responsável por salvar um cliente no sistema.")
	 @PostMapping
	    public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

		 Cliente clienteRequisicao = request.buildCliente();
			Cliente clienteSalvo = clienteService.save(clienteRequisicao);
			return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.CREATED);
	    }
}