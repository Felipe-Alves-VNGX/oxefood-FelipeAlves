package br.com.ifpe.oxefoodFelipeAlves.util.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"id"})
public class EntidadeNegocio implements Serializable {
	
	private static final long serialVersionUID = 5775856560407645583L;

	private Long id;
	
	private Boolean habilitado;
}
