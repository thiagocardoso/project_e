package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>, ListQueryDslPredicateExecutor<Disciplina> {

}
