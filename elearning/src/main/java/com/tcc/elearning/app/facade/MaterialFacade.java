package com.tcc.elearning.app.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Material;
import com.tcc.elearning.app.repository.MaterialRepository;

@Service
public class MaterialFacade {
	@Autowired
	MaterialRepository materialRepository;
	
	@Transactional
	public Material save(Material material) {
		checkNotNull(material);
		Material saved = materialRepository.save(material);
		return saved;
	}	
	
	public Material novoMaterial(){
		return Material.newMaterial();
	}
}
