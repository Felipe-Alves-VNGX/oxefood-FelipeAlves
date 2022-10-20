package br.com.ifpe.oxefoodFelipeAlves.servicos.empresa;


import br.com.ifpe.oxefoodFelipeAlves.modelo.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaRequest {
	private String chave;
	
	private String site;
	
	private String cnpj;
	
	private String inscricaoEstadual;
	
	private String nomeEmpresarial;
	
	private String nomeFantasia;
	
	private String fone;
	
	private String foneAlternativo;
	
	public Empresa buildEmpresa() {
		return Empresa.builder()
			.chave(chave)
			.cnpj(cnpj)
			.site(site)
			.fone(fone)
			.foneAlternativo(foneAlternativo)
			.nomeEmpresarial(nomeEmpresarial)
			.nomeFantasia(nomeFantasia)
			.inscricaoEstadual(inscricaoEstadual)
			.build();
	}
	
}
