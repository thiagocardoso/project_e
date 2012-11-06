package com.tcc.elearning.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import com.google.common.base.Objects;

@Entity
public class ExercicioAlternativa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Version
	private Integer version;

	private String titulo;

	@Lob
	private String descricao;

	private Boolean alternativaCorreta = Boolean.FALSE;

	@NotNull
	private Integer sequencia = 0;

	@JoinColumn(name = "exercicio_id")
	@ManyToOne(optional = false)
	private Exercicio exercicio;

	ExercicioAlternativa() {
	}

	public static ExercicioAlternativa newInstance(Exercicio exercicio) {
		ExercicioAlternativa exercicioAlternativa = new ExercicioAlternativa();
		exercicioAlternativa.setExercicio(exercicio);
		return exercicioAlternativa;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.exercicio, this.titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ExercicioAlternativa) {
			ExercicioAlternativa other = (ExercicioAlternativa) obj;
			return Objects.equal(this.exercicio, other.exercicio)
					&& Objects.equal(this.titulo, other.titulo);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("exercicio", exercicio)
				.add("titulo", titulo).toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(Boolean alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	public Integer getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}
}
