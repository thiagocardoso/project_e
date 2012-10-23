package com.tcc.elearning.app.seguranca;

import org.springframework.security.core.GrantedAuthority;


public enum Permissao implements GrantedAuthority {

	ROLE_ALUNO,
	ROLE_PROFESSOR,
	ROLE_ADMIN,
	ROLE_GUEST;

	@Override
	public String getAuthority() {
		return name();
	}

}