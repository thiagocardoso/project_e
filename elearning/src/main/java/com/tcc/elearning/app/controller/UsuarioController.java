package com.tcc.elearning.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcc.elearning.app.entity.Curso;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.facade.UsuarioFacade;
import com.tcc.elearning.app.repository.UsuarioRepository;
import com.tcc.elearning.app.seguranca.Permissao;

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
	
	private void changePermissao(Usuario usuario, Permissao permissao){
		if(usuario.getPermissoes().contains(permissao)){
			usuario.getPermissoes().remove(permissao);
		}else{
			usuario.getPermissoes().add(permissao);
		}
	}
	
	public void changeAdmin(Usuario usuario){
		changePermissao(usuario, Permissao.ROLE_ADMIN);
	}
	
	public void changeAluno(Usuario usuario){
		changePermissao(usuario, Permissao.ROLE_ALUNO);
	}
	
	public void changeProfessor(Usuario usuario){
		changePermissao(usuario, Permissao.ROLE_PROFESSOR);
	}
	
	public void matricular(Usuario usuario, Curso curso){
		Usuario usuarioSalvo = usuarioRepository.findOne(usuario.getId());
		usuarioSalvo.getCursos().add(curso);
		usuarioRepository.save(usuarioSalvo);
	}
	
	public void desmatricular(Usuario usuario, Curso curso){
		Usuario usuarioSalvo = usuarioRepository.findOne(usuario.getId());
		if(usuarioSalvo.getCursos().contains(curso)){
			usuarioSalvo.getCursos().remove(curso);
		}
		usuarioRepository.save(usuarioSalvo);
	}
	
	public boolean isMatriculado(Usuario usuario, Curso curso){
		Usuario usuarioSalvo = usuarioRepository.findOne(usuario.getId());
		return usuarioSalvo.isMatriculado(curso);
	}
}
