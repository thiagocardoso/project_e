package com.tcc.elearning.app.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.QUsuario;
import com.tcc.elearning.app.entity.Usuario;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("desenvolvimento")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Test
	@Transactional
	public void save() {
		Usuario usuario = Usuario.newUsuario();
		usuario.setLogin("usuarioTeste");
		usuario.setNome("usuario teste!");
		usuario.setEmail("usuario@email.com");
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		assertNotNull(usuarioSalvo.getId());
		assertNotNull(usuarioRepository.findOne(usuarioSalvo.getId()));
		assertNotNull(usuarioRepository.findOne(QUsuario.usuario.login.eq("usuarioTeste")));
	}

}
