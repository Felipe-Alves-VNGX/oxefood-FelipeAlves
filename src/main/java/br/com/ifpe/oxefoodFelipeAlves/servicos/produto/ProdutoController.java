package br.com.ifpe.oxefoodFelipeAlves.servicos.produto;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodFelipeAlves.modelo.produto.Produto;
import br.com.ifpe.oxefoodFelipeAlves.modelo.produto.ProdutoService;
import br.com.ifpe.oxefoodFelipeAlves.util.entity.GenericController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController extends GenericController{
	@Autowired
	private ProdutoService produtoService;
	@ApiOperation(value="Serviço responsável por salvar um cliente no sistema.")
	 @PostMapping
	    public ResponseEntity<Produto> save(@RequestBody @Valid ProdutoRequest request) {

		 Produto produtoRequisicao = request.buildProduto();
		 Produto produtoSalvo = produtoService.save(produtoRequisicao);
			return new ResponseEntity<Produto>(produtoSalvo, HttpStatus.CREATED);
	    }
}
