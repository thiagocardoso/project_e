package com.tcc.elearning.entity;


import java.util.ArrayList;
import java.util.Date;

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
public class CursoTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	public void novoCurso() {
		Curso curso = Curso.newCurso();
		
		curso.setCodigo(123);
		curso.setNome("curso 1");
		curso.setDescricao("curso de teste!!!");
		curso.setDataCriacao(new Date());		
		curso.setCriador(Usuario.newUsuario());
		
		entityManager.persist(curso);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT c FROM Curso c WHERE codigo=123");
		ArrayList<Curso> result = (ArrayList<Curso>) query.getResultList();
		Assert.assertEquals(new Integer(123), result.get(0).getCodigo());
	}

}
