package com.tcc.elearning.app.entity;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("teste")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class UsuarioTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	public void novoUsuario() {
		Usuario usuario = Usuario.newUsuario();
		
		usuario.setNome("Usuario 1!");
		usuario.setLogin("usuario1");
		usuario.setEmail("email@email.com");
		
		entityManager.persist(usuario);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT u FROM Usuario u WHERE login='usuario1'");
		ArrayList<Usuario> result = (ArrayList<Usuario>) query.getResultList();
		Assert.assertEquals("Usuario 1!", result.get(0).getNome());
	}

}
