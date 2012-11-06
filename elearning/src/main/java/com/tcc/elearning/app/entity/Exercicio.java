package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

import org.hibernate.annotations.Type;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.tcc.elearning.app.entity.enums.TipoExercicio;

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

	@Type(type = "tipoExercicio")
	private TipoExercicio tipoExercicio = TipoExercicio.DISSERTATIVO;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario criador;

	@ManyToOne
	@JoinColumn(name = "licao_id")
	private Licao licao;
	
	@OneToMany(mappedBy = "exercicio")
	private List<ExercicioAlternativa> exercicioAlternativas = Lists.newLinkedList();

	Exercicio() {
	}

	public static final Exercicio newExercicio() {
		Exercicio exercicio = new Exercicio();
		exercicio.dataCriacao = new Date();
		return exercicio;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.licao, this.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Exercicio) {
			Exercicio other = (Exercicio) obj;
			return Objects.equal(this.licao, other.licao)
					&& Objects.equal(this.nome, other.nome);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Exercicio.class).add("licao", licao)
				.add("nome", nome).toString();
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

	public TipoExercicio getTipoExercicio() {
		return tipoExercicio;
	}

	public void setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	public Licao getLicao() {
		return licao;
	}

	public void setLicao(Licao licao) {
		this.licao = licao;
	}

	public List<ExercicioAlternativa> getExercicioAlternativas() {
		return exercicioAlternativas;
	}

	public void setExercicioAlternativas(List<ExercicioAlternativa> exercicioAlternativas) {
		this.exercicioAlternativas = exercicioAlternativas;
	}
}
