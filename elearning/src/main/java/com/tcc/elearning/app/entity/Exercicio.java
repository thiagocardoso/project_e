package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.google.common.base.Objects;
import com.tcc.elearning.app.entity.enums.TipoExercicioEnum;

@Entity
public class Exercicio implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Long id;

	@Version
	private Integer version;
	
    private String nome;

	@Lob
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @Enumerated
    private TipoExercicioEnum tipoExercicio;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario criador;
    
    Exercicio() {
    }
    
    public static final Exercicio newExercicio(){
    	Exercicio exercicio = new Exercicio();
    	exercicio.dataCriacao = new Date();
    	return exercicio;
    }

    @Override
	public int hashCode() {
		return Objects.hashCode(this.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Exercicio){
    		Exercicio other = (Exercicio) obj;
    		return Objects.equal(this.id, other.id);
    	}
    	return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Exercicio.class).add("nome", nome).toString();
	}    
    
    public Long getId() {
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

	public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public TipoExercicioEnum getTipoExercicio() {
		return tipoExercicio;
	}

	public void setTipoExercicio(TipoExercicioEnum tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}
}
