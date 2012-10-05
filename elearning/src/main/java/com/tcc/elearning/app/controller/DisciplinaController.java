package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Curso;
import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.app.facade.DisciplinaFacade;
import com.tcc.elearning.app.repository.DisciplinaRepository;

@Controller
public class DisciplinaController {
	@Autowired
	DisciplinaFacade disciplinaFacade;
	
	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	public Disciplina novo(){
		return disciplinaFacade.novaDisciplina();
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinaRepository.findAll();
	}
}
