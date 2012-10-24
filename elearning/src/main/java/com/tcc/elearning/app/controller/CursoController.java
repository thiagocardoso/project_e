package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Curso;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.CursoFacade;
import com.tcc.elearning.app.repository.CursoRepository;

@Controller
public class CursoController {
	@Autowired
	CursoFacade cursoFacade;
	
	@Autowired
	CursoRepository cursoRepository;
	
	public Curso novo(){
		Usuario usuario = (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Curso curso = cursoFacade.novoCurso(); 
		curso.setCriador(usuario);
		return curso;
	}
	
	public List<Curso> getCursos(){
		return cursoRepository.findAll();
	}
}
