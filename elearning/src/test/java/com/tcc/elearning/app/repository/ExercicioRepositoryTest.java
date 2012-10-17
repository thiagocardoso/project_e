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

import com.tcc.elearning.app.entity.Exercicio;
import com.tcc.elearning.app.entity.QExercicio;
import com.tcc.elearning.app.entity.enums.TipoExercicio;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("desenvolvimento")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class ExercicioRepositoryTest {

	@Autowired
	ExercicioRepository exercicioRepository;

	@Test
	@Transactional
	public void save() {
		Exercicio exercicio = Exercicio.newExercicio();
		exercicio.setNome("Exercicio teste 1");
		exercicio.setDescricao("Descricao de exercicio 1");
		exercicio.setTipoExercicio(TipoExercicio.MULTIPLA_ESCOLHA);
		Exercicio exercicioSalvo = exercicioRepository.save(exercicio);
		assertNotNull(exercicioSalvo.getId());
		assertNotNull(exercicioRepository.findOne(exercicioSalvo.getId()));
		assertNotNull(exercicioRepository.findOne(QExercicio.exercicio.nome.eq("Exercicio teste 1")));
	}

}
