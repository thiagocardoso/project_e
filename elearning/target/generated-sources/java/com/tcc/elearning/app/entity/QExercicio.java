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

    public static final QExercicio exercicio = new QExercicio("exercicio");

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> tipoExercicio = createNumber("tipoExercicio", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QExercicio(String variable) {
        super(Exercicio.class, forVariable(variable));
    }

    public QExercicio(Path<? extends Exercicio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExercicio(PathMetadata<?> metadata) {
        super(Exercicio.class, metadata);
    }

}

