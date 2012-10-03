package com.tcc.elearning.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.entity.Curso;
import com.tcc.elearning.repository.CursoRepository;

@Service
public class CursoFacade {
	@Autowired
	CursoRepository cursoRepository;
	
	@Transactional
	public Curso save(Curso curso) {
		checkNotNull(curso);
		Curso saved = cursoRepository.save(curso);
		return saved;
	}	
}
