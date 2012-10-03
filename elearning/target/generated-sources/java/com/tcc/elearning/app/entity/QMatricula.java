package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QMatricula is a Querydsl query type for Matricula
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMatricula extends EntityPathBase<Matricula> {

    private static final long serialVersionUID = 343343282;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QMatricula matricula = new QMatricula("matricula");

    public final QCurso curso;

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QUsuario usuario;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QMatricula(String variable) {
        this(Matricula.class, forVariable(variable), INITS);
    }

    public QMatricula(Path<? extends Matricula> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMatricula(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMatricula(PathMetadata<?> metadata, PathInits inits) {
        this(Matricula.class, metadata, inits);
    }

    public QMatricula(Class<? extends Matricula> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.curso = inits.isInitialized("curso") ? new QCurso(forProperty("curso"), inits.get("curso")) : null;
        this.usuario = inits.isInitialized("usuario") ? new QUsuario(forProperty("usuario")) : null;
    }

}

