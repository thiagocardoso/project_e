package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QLicao is a Querydsl query type for Licao
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLicao extends EntityPathBase<Licao> {

    private static final long serialVersionUID = 1453122152;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLicao licao = new QLicao("licao");

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final QDisciplina disciplina;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLicao(String variable) {
        this(Licao.class, forVariable(variable), INITS);
    }

    public QLicao(Path<? extends Licao> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicao(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicao(PathMetadata<?> metadata, PathInits inits) {
        this(Licao.class, metadata, inits);
    }

    public QLicao(Class<? extends Licao> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.disciplina = inits.isInitialized("disciplina") ? new QDisciplina(forProperty("disciplina")) : null;
    }

}

