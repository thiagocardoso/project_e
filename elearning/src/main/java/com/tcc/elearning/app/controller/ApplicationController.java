package com.tcc.elearning.app.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Usuario;

@Controller
public class ApplicationController {
	public Usuario getUsuarioAtivo(){
		return (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
}
