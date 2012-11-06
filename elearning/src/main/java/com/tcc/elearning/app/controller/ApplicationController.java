package com.tcc.elearning.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.repository.UsuarioRepository;

@Controller
public class ApplicationController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario getUsuarioAtivo(){
		Usuario usuario = (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		return usuarioRepository.findOne(usuario.getId());
	}
}
