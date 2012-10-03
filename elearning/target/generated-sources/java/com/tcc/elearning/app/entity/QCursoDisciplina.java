package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCursoDisciplina is a Querydsl query type for CursoDisciplina
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCursoDisciplina extends EntityPathBase<CursoDisciplina> {

    private static final long serialVersionUID = -1535495844;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCursoDisciplina cursoDisciplina = new QCursoDisciplina("cursoDisciplina");

    public final QCurso curso;

    public final QDisciplina disciplina;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QCursoDisciplina(String variable) {
        this(CursoDisciplina.class, forVariable(variable), INITS);
    }

    public QCursoDisciplina(Path<? extends CursoDisciplina> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCursoDisciplina(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCursoDisciplina(PathMetadata<?> metadata, PathInits inits) {
        this(CursoDisciplina.class, metadata, inits);
    }

    public QCursoDisciplina(Class<? extends CursoDisciplina> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.curso = inits.isInitialized("curso") ? new QCurso(forProperty("curso"), inits.get("curso")) : null;
        this.disciplina = inits.isInitialized("disciplina") ? new QDisciplina(forProperty("disciplina")) : null;
    }

}

