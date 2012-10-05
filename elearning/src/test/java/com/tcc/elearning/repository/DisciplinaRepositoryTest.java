package com.tcc.elearning.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.app.entity.QDisciplina;
import com.tcc.elearning.app.repository.DisciplinaRepository;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("teste")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class DisciplinaRepositoryTest {

	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	@Test
	public void save() {
		Disciplina disciplina = Disciplina.newDisciplina("Disciplina 1", "Disciplina Teste!");
		Disciplina saved = disciplinaRepository.save(disciplina);
		assertNotNull(saved.getId());
		assertNotNull(disciplinaRepository.findOne(saved.getId()));
		assertNotNull(disciplinaRepository.findOne(QDisciplina.disciplina.nome.eq("Disciplina 1")));
	}

}
