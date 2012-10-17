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

import com.tcc.elearning.app.entity.enums.TipoExercicio;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("teste")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class ExercicioTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	public void novoExercicio() {
		Exercicio exercicio = Exercicio.newExercicio();
		
		exercicio.setNome("Exercicio 1");
		exercicio.setDescricao("Descrição exercicio 1!");
		exercicio.setTipoExercicio(TipoExercicio.MULTIPLA_ESCOLHA);
		
		entityManager.persist(exercicio);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT e FROM Exercicio e WHERE nome='Exercicio 1'");
		ArrayList<Exercicio> result = (ArrayList<Exercicio>) query.getResultList();
		Assert.assertEquals(TipoExercicio.MULTIPLA_ESCOLHA, result.get(0).getTipoExercicio());
	}
}

