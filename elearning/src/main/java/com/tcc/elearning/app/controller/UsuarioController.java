package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.UsuarioFacade;
import com.tcc.elearning.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	@Autowired
	UsuarioFacade usuarioFacade;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario novo(){
		return usuarioFacade.novoUsuario();
	}
	
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
}
