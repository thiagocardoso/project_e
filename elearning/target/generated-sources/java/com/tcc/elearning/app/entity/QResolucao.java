package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QResolucao is a Querydsl query type for Resolucao
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QResolucao extends EntityPathBase<Resolucao> {

    private static final long serialVersionUID = 1602177645;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QResolucao resolucao = new QResolucao("resolucao");

    public final QExercicio exercicio;

    public final QExercicioAlternativa exercicioAlternativa;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QUsuario usuario;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QResolucao(String variable) {
        this(Resolucao.class, forVariable(variable), INITS);
    }

    public QResolucao(Path<? extends Resolucao> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QResolucao(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QResolucao(PathMetadata<?> metadata, PathInits inits) {
        this(Resolucao.class, metadata, inits);
    }

    public QResolucao(Class<? extends Resolucao> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.exercicio = inits.isInitialized("exercicio") ? new QExercicio(forProperty("exercicio"), inits.get("exercicio")) : null;
        this.exercicioAlternativa = inits.isInitialized("exercicioAlternativa") ? new QExercicioAlternativa(forProperty("exercicioAlternativa"), inits.get("exercicioAlternativa")) : null;
        this.usuario = inits.isInitialized("usuario") ? new QUsuario(forProperty("usuario")) : null;
    }

}

