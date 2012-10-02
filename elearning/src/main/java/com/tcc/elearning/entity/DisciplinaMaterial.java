package com.tcc.elearning.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class DisciplinaMaterial implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue
    private Integer id;

	@Version
	private Integer version;
	
	@JoinColumn(name = "disciplina_id")
    @ManyToOne(optional = false)
    private Disciplina disciplina;
    
	@JoinColumn(name = "material_id")
    @ManyToOne(optional = false)
    private Material material;

    DisciplinaMaterial() {
    }
}
