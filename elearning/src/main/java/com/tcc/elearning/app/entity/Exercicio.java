package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Exercicio implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Integer id;

	@Version
	private Integer version;
	
    private String nome;

	@Lob
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
	//transformar em Enum
    private Integer tipoExercicio;
    
    Exercicio() {
    }
}