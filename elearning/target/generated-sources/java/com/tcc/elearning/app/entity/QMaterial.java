package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QMaterial is a Querydsl query type for Material
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMaterial extends EntityPathBase<Material> {

    private static final long serialVersionUID = 414985075;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QMaterial material = new QMaterial("material");

    public final ArrayPath<Byte> arquivo = createArray("arquivo", Byte[].class);

    public final QUsuario criador;

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QMaterial(String variable) {
        this(Material.class, forVariable(variable), INITS);
    }

    public QMaterial(Path<? extends Material> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMaterial(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMaterial(PathMetadata<?> metadata, PathInits inits) {
        this(Material.class, metadata, inits);
    }

    public QMaterial(Class<? extends Material> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.criador = inits.isInitialized("criador") ? new QUsuario(forProperty("criador")) : null;
    }

}

