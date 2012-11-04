package com.tcc.elearning.app.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.tcc.elearning.app.seguranca.Permissao;

@Entity
public class Usuario implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue    
    private Long id;
    
	@Version
	private Integer version;
	
    private String nome;
    
    private String login;
    
    private String password;
    
	@Email(message="O email fornecido não é um email válido!")
    private String email;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<Permissao> permissoes = Lists.newLinkedList();

	@ManyToMany
    @JoinTable(name = "usuario_curso", joinColumns = @JoinColumn(name="usuario_id"), inverseJoinColumns = @JoinColumn(name="curso_id"))
    private List<Curso> cursos = Lists.newLinkedList();	
	
	@OneToMany(mappedBy="criador")
	private List<Curso> cursosCriados = Lists.newLinkedList();
	
    Usuario() {
    }

    public final static Usuario newUsuario(){
    	Usuario usuario = new Usuario();
    	usuario.permissoes.add(Permissao.ROLE_ALUNO);
    	return usuario;
    } 
    
    @Override
    public int hashCode() {
    	return Objects.hashCode(this.login);
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Usuario){
    		Usuario other = (Usuario) obj;
    		return Objects.equal(this.login, other.login);
    	}
    	return false;
    }
    
    @Override
    public String toString() {
    	return Objects.toStringHelper(Usuario.class).add("login", login).toString();
    }    
    
    public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getVersion() {
		return version;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Permissao> getPermissoes() {
		return ImmutableList.copyOf(permissoes);
	}

	public boolean isAdmin(){
		return permissoes.contains(Permissao.ROLE_ADMIN);
	}
	
	public boolean isAluno(){
		return permissoes.contains(Permissao.ROLE_ALUNO);
	}
	
	public boolean isProfessor(){
		return permissoes.contains(Permissao.ROLE_PROFESSOR);
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public List<Curso> getCursosCriados() {
		return cursosCriados;
	}
	
	public void setCursosCriados(List<Curso> cursosCriados) {
		this.cursosCriados = cursosCriados;
	}

	public boolean isMatriculado(Curso curso){
		return this.cursos.contains(curso);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return ImmutableList.copyOf(permissoes);
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
