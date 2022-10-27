package br.com.ifpe.oxefoodFelipeAlves.servicos.empresa;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodFelipeAlves.modelo.empresa.Empresa;
import br.com.ifpe.oxefoodFelipeAlves.modelo.empresa.EmpresaService;
import br.com.ifpe.oxefoodFelipeAlves.util.entity.GenericController;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/api/empresa")
public class EmpresaController extends GenericController{
	@Autowired
	private EmpresaService empresaService;
	@ApiOperation(value="Serviço responsável por salvar um cliente no sistema.")
	 @PostMapping
	    public ResponseEntity<Empresa> save(@RequestBody @Valid EmpresaRequest request) {

		 Empresa empresaRequisicao = request.buildEmpresa();
		 Empresa empresaSalva = empresaService.save(empresaRequisicao);
			return new ResponseEntity<Empresa>(empresaSalva, HttpStatus.CREATED);
	    }
}
