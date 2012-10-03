package com.tcc.elearning.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QLicaoMaterial is a Querydsl query type for LicaoMaterial
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLicaoMaterial extends EntityPathBase<LicaoMaterial> {

    private static final long serialVersionUID = 1099750146;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLicaoMaterial licaoMaterial = new QLicaoMaterial("licaoMaterial");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QLicao licao;

    public final QMaterial material;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLicaoMaterial(String variable) {
        this(LicaoMaterial.class, forVariable(variable), INITS);
    }

    public QLicaoMaterial(Path<? extends LicaoMaterial> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicaoMaterial(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLicaoMaterial(PathMetadata<?> metadata, PathInits inits) {
        this(LicaoMaterial.class, metadata, inits);
    }

    public QLicaoMaterial(Class<? extends LicaoMaterial> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.licao = inits.isInitialized("licao") ? new QLicao(forProperty("licao")) : null;
        this.material = inits.isInitialized("material") ? new QMaterial(forProperty("material")) : null;
    }

}

