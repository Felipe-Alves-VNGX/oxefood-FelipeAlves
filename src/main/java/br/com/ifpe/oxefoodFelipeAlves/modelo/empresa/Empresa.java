package br.com.ifpe.oxefoodFelipeAlves.modelo.empresa;

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
@Table(name = "Empresa")
@Builder
@Setter
@Getter
@Where(clause = "habilitado = true")
@AllArgsConstructor
@NoArgsConstructor
public class Empresa extends EntidadeAuditavel {
	private static final long serialVersionUID = -3650220746410444237L;
	@NotNull
	@Column(nullable = false)
	private String chave;
	@Column
	private String site;
	@Column
	private String cnpj;
	@Column
	private String inscricaoEstadual;
	@Column
	private String nomeEmpresarial;
	@Column
	private String nomeFantasia;
	@Column
	private String fone;
	@Column
	private String foneAlternativo;
}
