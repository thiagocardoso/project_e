package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Licao;
import com.tcc.elearning.app.facade.LicaoFacade;
import com.tcc.elearning.app.repository.LicaoRepository;

@Controller
public class LicaoController {
	@Autowired
	LicaoFacade licaoFacade;
	
	@Autowired
	LicaoRepository licaoRepository;
	
	public Licao novo(){
		return licaoFacade.novaLicao();
	}
	
	public List<Licao> getLicoes(){
		return licaoRepository.findAll();
	}
}
