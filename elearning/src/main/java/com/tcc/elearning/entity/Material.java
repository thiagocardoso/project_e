package com.tcc.elearning.entity;

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
public class Material implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Integer id;

	@Version
	private Integer version;
	
    private String nome;

	@Lob
    private String descricao;

	@Lob
    private byte[] arquivo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    Material(){
    }
}
