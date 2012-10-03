package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>, ListQueryDslPredicateExecutor<Curso> {

}
