package com.tcc.elearning.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QMaterial is a Querydsl query type for Material
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMaterial extends EntityPathBase<Material> {

    private static final long serialVersionUID = 571640896;

    public static final QMaterial material = new QMaterial("material");

    public final ArrayPath<Byte> arquivo = createArray("arquivo", Byte[].class);

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QMaterial(String variable) {
        super(Material.class, forVariable(variable));
    }

    public QMaterial(Path<? extends Material> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMaterial(PathMetadata<?> metadata) {
        super(Material.class, metadata);
    }

}

