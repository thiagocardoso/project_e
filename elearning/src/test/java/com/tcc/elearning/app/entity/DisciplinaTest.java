package com.tcc.elearning.app.entity;

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

import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("teste")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class DisciplinaTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	public void novaDisciplina() {
		Disciplina disciplina = Disciplina.newDisciplina();
		
		disciplina.setNome("disciplina 1");
		disciplina.setDescricao("disciplina de teste!!!");
		
		entityManager.persist(disciplina);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT d FROM Disciplina d WHERE nome= 'disciplina 1'");
		ArrayList<Disciplina> result = (ArrayList<Disciplina>) query.getResultList();
		Assert.assertEquals("disciplina 1", result.get(0).getNome());
		
	}

}
