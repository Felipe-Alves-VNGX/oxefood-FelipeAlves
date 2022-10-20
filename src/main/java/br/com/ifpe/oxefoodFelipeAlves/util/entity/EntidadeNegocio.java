package br.com.ifpe.oxefoodFelipeAlves.util.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@MappedSuperclass
@Data
@EqualsAndHashCode(of = {"id"})
public abstract class EntidadeNegocio implements Serializable {

    private static final long serialVersionUID = -6729148655967529524L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonIgnore
    @NotNull
    @Column
    private Boolean habilitado;

}

