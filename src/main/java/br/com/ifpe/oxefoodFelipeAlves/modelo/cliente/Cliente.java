package br.com.ifpe.oxefoodFelipeAlves.modelo.cliente;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodFelipeAlves.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cliente")
@Builder
@Setter
@Getter
@Where(clause = "habilitado = true")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel{
	private static final long serialVersionUID = -1277898401089183837L;
	@JsonIgnore
	@NotNull
	@Column(nullable = false)
	private String chaveEmpresa;
    @OneToMany(mappedBy = "cliente", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<EnderecoCliente> enderecos;
	@Column
	private String nome;
	@Column
	private String cpf;
	@Column
	private String fone;
	@Column
	private String foneAlternativo;
}
