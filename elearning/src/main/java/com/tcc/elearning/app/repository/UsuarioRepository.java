package com.tcc.elearning.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.elearning.app.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, ListQueryDslPredicateExecutor<Usuario> {

}
