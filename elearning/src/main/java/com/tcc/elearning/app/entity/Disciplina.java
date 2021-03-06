package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

@Entity
public class Disciplina implements Serializable {

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

	@ManyToMany
	@JoinTable(name = "disciplina_material", joinColumns = @JoinColumn(name = "disciplina_id"), inverseJoinColumns = @JoinColumn(name = "material_id"))
	private List<Material> materiais = Lists.newLinkedList();

	@ManyToMany(mappedBy = "disciplinas")
	private List<Curso> cursos;

	@OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL)
	private List<Licao> licoes = Lists.newLinkedList();

	Disciplina() {
	}

	public static Disciplina newDisciplina() {
		Disciplina disciplina = new Disciplina();
		disciplina.dataCriacao = new Date();
		return disciplina;
	}

	public static Disciplina newDisciplina(String nome, String descricao) {
		Disciplina disciplina = new Disciplina();
		disciplina.nome = nome;
		disciplina.descricao = descricao;
		disciplina.dataCriacao = new Date();
		return disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Disciplina) {
			Disciplina other = (Disciplina) obj;
			return Objects.equal(this.nome, other.nome);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Disciplina.class).add("nome", nome)
				.toString();
	}

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public List<Licao> getLicoes() {
		return licoes;
	}

	public void setLicoes(List<Licao> licoes) {
		this.licoes = licoes;
	}

	public Disciplina addLicao(Licao licao) {
		this.licoes.add(licao);
		return this;
	}
}
