package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Licao;

public interface LicaoRepository extends JpaRepository<Licao, Long>, ListQueryDslPredicateExecutor<Licao> {

}
