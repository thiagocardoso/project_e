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

    public static final QLicao licao = new QLicao("licao");

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLicao(String variable) {
        super(Licao.class, forVariable(variable));
    }

    public QLicao(Path<? extends Licao> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLicao(PathMetadata<?> metadata) {
        super(Licao.class, metadata);
    }

}

