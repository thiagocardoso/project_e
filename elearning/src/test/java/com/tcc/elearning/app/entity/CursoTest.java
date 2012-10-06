package com.tcc.elearning.app.entity;


import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Curso;
import com.tcc.elearning.app.repository.CursoRepository;
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
		
		entityManager.persist(curso);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT c FROM Curso c WHERE codigo=123");
		ArrayList<Curso> result = (ArrayList<Curso>) query.getResultList();
		Assert.assertEquals(new Integer(123), result.get(0).getCodigo());
		
	}
	
	@Test
	@Transactional
	public void adicionarDisciplina(){
		Curso curso = Curso.newCurso();
		curso.setCodigo(1234);
		curso.setNome("curso 2");
		curso.setDescricao("Teste de curso com disciplinas.");
		
		Disciplina disciplina = Disciplina.newDisciplina();
		disciplina.setNome("Disciplina 1");
		disciplina.setDescricao("disciplina 1");
		entityManager.persist(disciplina);
		
		Disciplina disciplina2 = Disciplina.newDisciplina();
		disciplina2.setNome("Disciplina 2");
		disciplina2.setDescricao("disciplina 2");
		entityManager.persist(disciplina2);
		
		curso.getDisciplinas().add(disciplina);
		curso.getDisciplinas().add(disciplina2);
		
		entityManager.persist(curso);
		entityManager.flush();
		
		Query query = entityManager.createQuery("SELECT c FROM Curso c WHERE codigo=1234");
		Curso result = (Curso) query.getResultList().get(0);
		Assert.assertEquals(2, result.getDisciplinas().size());
	}

}
