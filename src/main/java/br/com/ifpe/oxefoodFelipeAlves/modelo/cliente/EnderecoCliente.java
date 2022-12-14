package br.com.ifpe.oxefoodFelipeAlves.modelo.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodFelipeAlves.util.entity.EntidadeNegocio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Builder
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Where(clause = "habilitado = true")
public class EnderecoCliente extends EntidadeNegocio implements Serializable {


	private static final long serialVersionUID = -2988621615646292152L;

	public static final String LABEL = "Endereço";

    @JsonIgnore
    @ManyToOne
    private Cliente cliente;

    @Column(length = 255, nullable = false)
    private String rua;

    @Column(length = 8, nullable = false)
    private String numero;

    @Column(length = 50, nullable = false)
    private String bairro;

    @Column(length = 10, nullable = false)
    private String cep;

    @Column(length = 50, nullable = false)
    private String cidade;

    @Column(length = 2, nullable = false)
    private String estado;

    @Column(length = 255)
    private String complemento;

    @JsonGetter(value = "enderecoFormatado")
    public String getEnderecoFormatado() {
	String complemento = StringUtils.isNotBlank(this.complemento) ? String.format(" - %s", this.complemento) : "";
	return String.format("%s Nº%s - %s, %s, %s%s", this.rua, this.numero, this.cidade, this.estado, this.cep, complemento);
    }

    public void updateFrom(EnderecoCliente novoEndereco) {
	
    }
}

