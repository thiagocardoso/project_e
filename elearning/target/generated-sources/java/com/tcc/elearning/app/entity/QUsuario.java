package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = 286536546;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final ListPath<Curso, QCurso> cursos = this.<Curso, QCurso>createList("cursos", Curso.class, QCurso.class);

    public final ListPath<Curso, QCurso> cursosCriados = this.<Curso, QCurso>createList("cursosCriados", Curso.class, QCurso.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath login = createString("login");

    public final StringPath nome = createString("nome");

    public final StringPath password = createString("password");

    public final ListPath<com.tcc.elearning.app.seguranca.Permissao, EnumPath<com.tcc.elearning.app.seguranca.Permissao>> permissoes = this.<com.tcc.elearning.app.seguranca.Permissao, EnumPath<com.tcc.elearning.app.seguranca.Permissao>>createList("permissoes", com.tcc.elearning.app.seguranca.Permissao.class, EnumPath.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QUsuario(String variable) {
        super(Usuario.class, forVariable(variable));
    }

    public QUsuario(Path<? extends Usuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsuario(PathMetadata<?> metadata) {
        super(Usuario.class, metadata);
    }

}

