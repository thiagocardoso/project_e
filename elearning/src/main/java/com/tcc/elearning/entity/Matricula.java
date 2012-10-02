package com.tcc.elearning.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Matricula implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Integer id;

	@Version
	private Integer version;
	
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @JoinColumn(name = "curso_id")
    @ManyToOne(optional = false)
    private Curso curso;
   
    @JoinColumn(name = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    Matricula() {
    }
}
