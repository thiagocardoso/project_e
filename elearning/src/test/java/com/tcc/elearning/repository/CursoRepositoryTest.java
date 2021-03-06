package com.tcc.elearning.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.tcc.elearning.app.entity.Curso;
import com.tcc.elearning.app.entity.QCurso;
import com.tcc.elearning.app.repository.CursoRepository;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("desenvolvimento")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class CursoRepositoryTest {

	@Autowired
	CursoRepository cursoRepository;
	
	@Test
	@Transactional
	public void save() {
		Curso curso = Curso.newCurso();
		curso.setCodigo(1234);
		curso.setNome("curso teste!");
		Curso cursoSalvo = cursoRepository.save(curso);
		assertNotNull(cursoSalvo.getId());
		assertNotNull(cursoRepository.findOne(cursoSalvo.getId()));
		assertNotNull(cursoRepository.findOne(QCurso.curso.nome.eq("curso teste!")));
	}

}
