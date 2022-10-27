package br.com.ifpe.oxefoodFelipeAlves.modelo.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodFelipeAlves.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@Builder
@Setter
@Getter
@Where(clause = "habilitado = true")
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel{
	private static final long serialVersionUID = 3252883709874163393L;
	@NotNull
	@Column(nullable = false)
	private String chaveEmpresa;
	@Column
	private String codigo;
	@Column
	private String titulo;
	@Column
	private String descricao;
	@Column
	private Double valorUnitario;
	@Column
	private String tempoEntrega;
	@Column
	private Boolean temComplemento;
	@Column
	private Boolean emDestaque;
}
