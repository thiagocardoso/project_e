package com.tcc.elearning.app.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.tcc.elearning.app.entity.Disciplina;
import com.tcc.elearning.app.entity.Licao;
import com.tcc.elearning.app.entity.QLicao;
import com.tcc.elearning.config.ELearningConfig;

@ActiveProfiles("desenvolvimento")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ELearningConfig.class)
@TransactionConfiguration
public class LicaoRepositoryTest {

	@Autowired
	LicaoRepository licaoRepository;

	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	@Test
	public void save() {
		Licao licao = Licao.newLicao();
		licao.setNome("Licao teste 1");
		licao.setDescricao("Descricao de licao 1");
		Licao licaoSalvo = licaoRepository.save(licao);
		assertNotNull(licaoSalvo.getId());
		assertNotNull(licaoRepository.findOne(licaoSalvo.getId()));
		assertNotNull(licaoRepository.findOne(QLicao.licao.nome.eq("Licao teste 1")));
	}

	@Test
	public void findByDisciplina(){
		Disciplina disciplina = Disciplina.newDisciplina("Nova Disciplina", "Disciplina de teste!");
		
		Licao licao = Licao.newLicao();
		licao.setNome("Licao teste 1");
		licao.setDescricao("Descricao de licao 1");
		licao.setDisciplina(disciplina);
		
		disciplina.addLicao(licao);
		
		disciplinaRepository.save(disciplina);
		disciplinaRepository.flush();
		
		List<Licao> busca = licaoRepository.findByDisciplina(disciplina);
		assertNotNull(busca);
		Assert.assertFalse(busca.isEmpty());
		assertEquals("Licao teste 1", busca.get(0).getNome());
		assertEquals("Nova Disciplina", busca.get(0).getDisciplina().getNome());
	}
}
