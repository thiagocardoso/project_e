package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.app.entity.Licao;
import com.tcc.elearning.app.facade.DisciplinaFacade;
import com.tcc.elearning.app.repository.DisciplinaRepository;
import com.tcc.elearning.app.repository.LicaoRepository;

@Controller
public class DisciplinaController {
	@Autowired
	DisciplinaFacade disciplinaFacade;
	
	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	@Autowired
	LicaoRepository licaoRepository;
	
	public Disciplina novo(){
		return disciplinaFacade.novaDisciplina();
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinaRepository.findAll();
	}
	
	public Disciplina apagarLicao(Disciplina disciplina, Licao licao){
		disciplina.getLicoes().remove(licao);
		licaoRepository.delete(licao);
		Disciplina saved = disciplinaFacade.save(disciplina);
		return saved;
	}
}
