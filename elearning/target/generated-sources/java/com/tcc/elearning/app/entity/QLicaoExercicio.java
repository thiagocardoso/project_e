package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QLicaoExercicio is a Querydsl query type for LicaoExercicio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLicaoExercicio extends EntityPathBase<LicaoExercicio> {

    private static final long serialVersionUID = -1147637637;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLicaoExercicio licaoExercicio = new QLicaoExercicio("licaoExercicio");

    public final QExercicio exercicio;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QLicao licao;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLicaoExercicio(String variable) {
        this(LicaoExercicio.class, forVariable(variable), INITS);
    }

    public QLicaoExercicio(Path<? extends LicaoExercicio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicaoExercicio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicaoExercicio(PathMetadata<?> metadata, PathInits inits) {
        this(LicaoExercicio.class, metadata, inits);
    }

    public QLicaoExercicio(Class<? extends LicaoExercicio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.exercicio = inits.isInitialized("exercicio") ? new QExercicio(forProperty("exercicio")) : null;
        this.licao = inits.isInitialized("licao") ? new QLicao(forProperty("licao")) : null;
    }

}

