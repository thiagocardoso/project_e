package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Exercicio;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.ExercicioFacade;
import com.tcc.elearning.app.repository.ExercicioRepository;

@Controller
public class ExercicioController {
	@Autowired
	ExercicioFacade exercicioFacade;
	
	@Autowired
	ExercicioRepository exercicioRepository;
	
	public Exercicio novo(){
		Usuario usuario = (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Exercicio exercicio = exercicioFacade.novoExercicio();
		exercicio.setCriador(usuario);
		return exercicio;
	}
	
	public List<Exercicio> getExercicios(){
		return exercicioRepository.findAll();
	}
}
