package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QExercicio is a Querydsl query type for Exercicio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QExercicio extends EntityPathBase<Exercicio> {

    private static final long serialVersionUID = -1379991241;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QExercicio exercicio = new QExercicio("exercicio");

    public final QUsuario criador;

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final EnumPath<com.tcc.elearning.app.entity.enums.TipoExercicioEnum> tipoExercicio = createEnum("tipoExercicio", com.tcc.elearning.app.entity.enums.TipoExercicioEnum.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QExercicio(String variable) {
        this(Exercicio.class, forVariable(variable), INITS);
    }

    public QExercicio(Path<? extends Exercicio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExercicio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExercicio(PathMetadata<?> metadata, PathInits inits) {
        this(Exercicio.class, metadata, inits);
    }

    public QExercicio(Class<? extends Exercicio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.criador = inits.isInitialized("criador") ? new QUsuario(forProperty("criador")) : null;
    }

}

