package com.tcc.elearning.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class ExercicioAlternativa implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Integer id;

	@Version
	private Integer version;
	
    private String titulo;

    private String descricao;

    private Boolean alternativaCorreta;
    
    private Integer sequencia;

    @JoinColumn(name = "exercicio_id")
    @ManyToOne(optional = false)
    private Exercicio exercicio;

    ExercicioAlternativa() {
    }
}
