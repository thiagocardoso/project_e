package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Material;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.MaterialFacade;
import com.tcc.elearning.app.repository.MaterialRepository;

@Controller
public class MaterialController {
	@Autowired
	MaterialFacade materialFacade;
	
	@Autowired
	MaterialRepository materialRepository;
	
	public Material novo(){
		Usuario usuario = (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Material material = materialFacade.novoMaterial(); 
		material.setCriador(usuario);
		return material;
	}
	
	public List<Material> getMateriais(){
		return materialRepository.findAll();
	}
}
