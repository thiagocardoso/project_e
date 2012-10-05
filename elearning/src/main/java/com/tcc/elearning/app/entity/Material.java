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

import com.google.common.base.Objects;

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
    
    public static final Material newMaterial(){
    	Material material = new Material();
    	material.dataCriacao = new Date();
    	return material;
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

	public byte[] getArquivo() {
		return arquivo;
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

	public Integer getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
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
		if(obj instanceof Material){
			Material other = (Material) obj;
    		return Objects.equal(this.nome, other.nome);
    	}
    	return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Material.class).add("nome", nome).toString();
	}	
}
