package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;
    
    private Integer codigo;
    
    private String nome;
    
    @Lob
    private String descricao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario criador;

    @ManyToMany
    @JoinTable(name = "curso_disciplina_join", joinColumns = @JoinColumn(name="curso_id"), inverseJoinColumns = @JoinColumn(name="disciplina_id"))
    private List<Disciplina> disciplinas = Lists.newLinkedList();
    
    @ManyToMany(mappedBy = "cursos")
    private List<Usuario> usuarios;
    
    Curso() {
    }
    
    public final static Curso newCurso(){
    	Curso curso = new Curso();
    	curso.dataCriacao = new Date();
    	return curso;
    }
    
    @Override
    public int hashCode() {
    	return Objects.hashCode(this.codigo);
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Curso){
    		Curso other = (Curso) obj;
    		return Objects.equal(this.codigo, other.codigo);
    	}
    	return false;
    }
    
    @Override
    public String toString() {
    	return Objects.toStringHelper(Curso.class).add("codigo", codigo).toString();
    }
    
    public Long getId() {
		return id;
	}
    
    public Integer getVersion() {
		return version;
	}
    
    public Integer getCodigo() {
		return codigo;
	}
    
    public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
    
    public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
