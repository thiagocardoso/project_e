package com.tcc.elearning.app.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.repository.UsuarioRepository;

@Service
public class UsuarioFacade {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario save(Usuario usuario) {
		checkNotNull(usuario);
		Usuario saved = usuarioRepository.save(usuario);
		return saved;
	}	
	
	public Usuario novoUsuario(){
		return Usuario.newUsuario();
	}
}
