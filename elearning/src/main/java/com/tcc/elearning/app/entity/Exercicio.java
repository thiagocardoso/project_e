package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.google.common.base.Objects;

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
    @Transient
    private Integer tipoExercicio;
    
    Exercicio() {
    }
    
    public static final Exercicio newExercicio(){
    	Exercicio exercicio = new Exercicio();
    	exercicio.dataCriacao = new Date();
    	return exercicio;
    }
    
    public Integer getId() {
		return id;
	}
    
    public Integer getVersion() {
		return version;
	}
    
    public String getNome() {
		return nome;
	}
    
    public void setNome(String nome) {
		this.nome = nome;
	}
    
    public String getDescricao() {
		return descricao;
	}
    
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    public Date getDataCriacao() {
		return dataCriacao;
	}
    
    @Override
	public int hashCode() {
		return Objects.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Exercicio){
    		Exercicio other = (Exercicio) obj;
    		return Objects.equal(this.nome, other.nome);
    	}
    	return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Exercicio.class).add("nome", nome).toString();
	}
}
