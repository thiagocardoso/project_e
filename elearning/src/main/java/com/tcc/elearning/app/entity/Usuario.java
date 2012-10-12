package com.tcc.elearning.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.Objects;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue    
    private Long id;
    
	@Version
	private Integer version;
	
    private String nome;
    
    private String login;
    
	@Email(message="O email fornecido não é um email válido!")
    private String email;

    Usuario() {
    }

    public final static Usuario newUsuario(){
    	return new Usuario();
    } 
    
    @Override
    public int hashCode() {
    	return Objects.hashCode(this.login);
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Usuario){
    		Usuario other = (Usuario) obj;
    		return Objects.equal(this.login, other.login);
    	}
    	return false;
    }
    
    @Override
    public String toString() {
    	return Objects.toStringHelper(Usuario.class).add("login", login).toString();
    }    
    
    public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getVersion() {
		return version;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
