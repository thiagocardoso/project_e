package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Exercicio;
import com.tcc.elearning.app.entity.ExercicioAlternativa;
import com.tcc.elearning.app.entity.Licao;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.ExercicioFacade;
import com.tcc.elearning.app.repository.ExercicioRepository;

@Controller
public class ExercicioController {
	@Autowired
	ExercicioFacade exercicioFacade;
	
	@Autowired
	ExercicioRepository exercicioRepository;
	
	@Autowired
	ApplicationController applicationController;
	
	public Exercicio novo(Licao licao){
		Usuario usuario = applicationController.getUsuarioAtivo();
		
		Exercicio exercicio = exercicioFacade.novoExercicio();
		exercicio.setCriador(usuario);
		exercicio.setLicao(licao);
		licao.getExercicios().add(exercicio);
		return exercicio;
	}
	
	public List<Exercicio> getExercicios(){
		return exercicioRepository.findAll();
	}
	
	public void addAlternativa(Exercicio exercicio, ExercicioAlternativa exercicioAlternativa){
		exercicio.addAlternativa(exercicioAlternativa);
	}
	
	public void excluirAlternativa(Exercicio exercicio, ExercicioAlternativa exercicioAlternativa){
		exercicio.excluirAlternativa(exercicioAlternativa);
	}
	
	public Exercicio marcarAlternativaCorreta(Exercicio exercicio, ExercicioAlternativa exercicioAlternativa){
		exercicio.marcarTodasAlternativasIncorretas();
		exercicio.marcarAlternativaCorreta(exercicioAlternativa);
		return exercicio;
	}
}
