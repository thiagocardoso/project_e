package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long>, ListQueryDslPredicateExecutor<Exercicio> {

}
