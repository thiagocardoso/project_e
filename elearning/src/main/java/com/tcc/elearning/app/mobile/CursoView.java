package com.tcc.elearning.app.mobile;

import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Curso;

@Controller
public class CursoView {
	private Curso curso = Curso.newCurso();

	public String editCurso() {
		return "pm:show";	
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
