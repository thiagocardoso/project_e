package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

@Entity
public class Licao implements Serializable {

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

	@ManyToOne
	@JoinColumn(name = "disciplina_id")
	private Disciplina disciplina;

	@OneToMany(mappedBy = "licao", cascade = CascadeType.ALL)
	private List<Exercicio> exercicios = Lists.newLinkedList();

	Licao() {
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.disciplina, this.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Licao) {
			Licao other = (Licao) obj;
			return Objects.equal(this.disciplina, other.disciplina)
					&& Objects.equal(this.nome, other.nome);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Licao.class)
				.add("disciplina", disciplina).add("nome", nome).toString();
	}

	public static final Licao newLicao() {
		Licao licao = new Licao();
		licao.dataCriacao = new Date();
		return licao;
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

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
}
