package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Long>, ListQueryDslPredicateExecutor<Material> {

}
