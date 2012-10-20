package com.tcc.elearning.app.seguranca.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.QUsuario;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.app.repository.UsuarioRepository;

@Service
public class ElearningUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findOne(QUsuario.usuario.login.eq(username));
		if (usuario != null) {
			usuario.getAuthorities();
		}
		return usuario;
	}

}