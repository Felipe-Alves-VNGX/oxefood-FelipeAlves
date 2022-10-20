package br.com.ifpe.oxefoodFelipeAlves.servicos.produto;

import br.com.ifpe.oxefoodFelipeAlves.modelo.produto.Produto;
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
public class ProdutoRequest {
	private String chaveEmpresa;

	private String codigo;

	private String titulo;
	
	private String descricao;
	
	private Double valorUnitario;
	
	private String tempoEntrega;
	
	private Boolean temComplemento;
	
	private Boolean emDestaque;
	
	public Produto buildProduto() {
		return Produto.builder()
			.chaveEmpresa(chaveEmpresa)
			.codigo(codigo)
			.titulo(titulo)
			.descricao(descricao)
			.valorUnitario(valorUnitario)
			.tempoEntrega(tempoEntrega)
			.temComplemento(temComplemento)
			.emDestaque(emDestaque)
			.build();
	}
}
