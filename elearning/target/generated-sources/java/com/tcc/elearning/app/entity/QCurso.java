package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCurso is a Querydsl query type for Curso
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCurso extends EntityPathBase<Curso> {

    private static final long serialVersionUID = 1445182928;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCurso curso = new QCurso("curso");

    public final NumberPath<Integer> codigo = createNumber("codigo", Integer.class);

    public final QUsuario criador;

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QCurso(String variable) {
        this(Curso.class, forVariable(variable), INITS);
    }

    public QCurso(Path<? extends Curso> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCurso(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCurso(PathMetadata<?> metadata, PathInits inits) {
        this(Curso.class, metadata, inits);
    }

    public QCurso(Class<? extends Curso> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.criador = inits.isInitialized("criador") ? new QUsuario(forProperty("criador")) : null;
    }

}

