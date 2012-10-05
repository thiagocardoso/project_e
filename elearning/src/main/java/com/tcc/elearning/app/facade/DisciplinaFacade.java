package com.tcc.elearning.app.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.app.repository.DisciplinaRepository;

@Service
public class DisciplinaFacade {
	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	@Transactional
	public Disciplina save(Disciplina disciplina) {
		checkNotNull(disciplina);
		Disciplina saved = disciplinaRepository.save(disciplina);
		return saved;
	}	
	
	public Disciplina novaDisciplina(){
		return Disciplina.newDisciplina();
	}
}
