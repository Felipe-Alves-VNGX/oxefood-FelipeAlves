package br.com.ifpe.oxefoodFelipeAlves.util.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EntidadeAuditavel extends EntidadeNegocio {
	
	private static final long serialVersionUID = 950430990436833582L;

	private Long versao;
	
	private LocalDate dataCriacao;
	
	private LocalDate dataUltimaModificacao;
	
	private Long criadoPor;
	
	private Long ultimaModificacaoPor;
}
