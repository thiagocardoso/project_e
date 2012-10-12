package com.tcc.elearning.app.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Exercicio;
import com.tcc.elearning.app.repository.ExercicioRepository;

@Service
public class ExercicioFacade {
	@Autowired
	ExercicioRepository exercicioRepository;
	
	@Transactional
	public Exercicio save(Exercicio exercicio) {
		checkNotNull(exercicio);
		Exercicio saved = exercicioRepository.save(exercicio);
		return saved;
	}	
	
	public Exercicio novoExercicio(){
		return Exercicio.newExercicio();
	}
}
