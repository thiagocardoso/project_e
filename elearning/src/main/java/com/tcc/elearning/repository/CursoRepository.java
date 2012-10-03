package com.tcc.elearning.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcc.elearning.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>, ListQueryDslPredicateExecutor<Curso> {

}
