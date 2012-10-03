package com.tcc.elearning.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue    
    private Integer id;
    
	@Version
	private Integer version;
	
    private String nome;
    
	@Email
    @NotEmpty
    private String email;

    Usuario() {
    }
    
    public final static Usuario newUsuario(){
    	return new Usuario();
    }
}
