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

	@Test
	@Transactional
	public void adicionarMaterial(){
		Disciplina disciplina = Disciplina.newDisciplina();
		disciplina.setNome("disciplina 2");
		disciplina.setDescricao("Teste de disciplina com material.");
		
		Material material = Material.newMaterial();
		material.setNome("material 1");
		material.setDescricao("material 1");
		entityManager.persist(material);
		
		Material material2 = Material.newMaterial();
		material2.setNome("material 2");
		material2.setDescricao("material2");
		entityManager.persist(material2);
		
		disciplina.getMateriais().add(material);
		disciplina.getMateriais().add(material2);
		
		entityManager.persist(disciplina);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT d FROM Disciplina d WHERE nome='disciplina 2'");
		Disciplina result = (Disciplina) query.getResultList().get(0);
		Assert.assertEquals(2, result.getMateriais().size());
	}	
	
}
