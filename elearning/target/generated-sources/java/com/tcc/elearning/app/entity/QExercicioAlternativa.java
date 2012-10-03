package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QExercicioAlternativa is a Querydsl query type for ExercicioAlternativa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QExercicioAlternativa extends EntityPathBase<ExercicioAlternativa> {

    private static final long serialVersionUID = 1163900402;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QExercicioAlternativa exercicioAlternativa = new QExercicioAlternativa("exercicioAlternativa");

    public final BooleanPath alternativaCorreta = createBoolean("alternativaCorreta");

    public final StringPath descricao = createString("descricao");

    public final QExercicio exercicio;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> sequencia = createNumber("sequencia", Integer.class);

    public final StringPath titulo = createString("titulo");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QExercicioAlternativa(String variable) {
        this(ExercicioAlternativa.class, forVariable(variable), INITS);
    }

    public QExercicioAlternativa(Path<? extends ExercicioAlternativa> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExercicioAlternativa(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExercicioAlternativa(PathMetadata<?> metadata, PathInits inits) {
        this(ExercicioAlternativa.class, metadata, inits);
    }

    public QExercicioAlternativa(Class<? extends ExercicioAlternativa> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.exercicio = inits.isInitialized("exercicio") ? new QExercicio(forProperty("exercicio")) : null;
    }

}

