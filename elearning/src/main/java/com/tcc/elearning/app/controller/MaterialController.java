package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Material;
import com.tcc.elearning.app.facade.MaterialFacade;
import com.tcc.elearning.app.repository.MaterialRepository;

@Controller
public class MaterialController {
	@Autowired
	MaterialFacade materialFacade;
	
	@Autowired
	MaterialRepository materialRepository;
	
	public Material novo(){
		return materialFacade.novoMaterial();
	}
	
	public List<Material> getMateriais(){
		return materialRepository.findAll();
	}
}
