package com.tcc.elearning.app.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Licao;
import com.tcc.elearning.app.repository.LicaoRepository;

@Service
public class LicaoFacade {
	@Autowired
	LicaoRepository licaoRepository;
	
	@Transactional
	public Licao save(Licao licao) {
		checkNotNull(licao);
		Licao saved = licaoRepository.save(licao);
		return saved;
	}	
	
	public Licao novaLicao(){
		return Licao.newLicao();
	}
}
