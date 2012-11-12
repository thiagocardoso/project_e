package com.tcc.elearning.app.controller;

import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Exercicio;
import com.tcc.elearning.app.entity.ExercicioAlternativa;

@Controller
public class AlternativaController {
	
	public ExercicioAlternativa novo(Exercicio exercicio){
		ExercicioAlternativa exercicioAlternativa = ExercicioAlternativa.newInstance(exercicio);
		return exercicioAlternativa;
	}
}
