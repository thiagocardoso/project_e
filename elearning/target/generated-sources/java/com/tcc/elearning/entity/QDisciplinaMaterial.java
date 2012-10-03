package com.tcc.elearning.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QDisciplinaMaterial is a Querydsl query type for DisciplinaMaterial
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDisciplinaMaterial extends EntityPathBase<DisciplinaMaterial> {

    private static final long serialVersionUID = -347270004;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QDisciplinaMaterial disciplinaMaterial = new QDisciplinaMaterial("disciplinaMaterial");

    public final QDisciplina disciplina;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QMaterial material;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QDisciplinaMaterial(String variable) {
        this(DisciplinaMaterial.class, forVariable(variable), INITS);
    }

    public QDisciplinaMaterial(Path<? extends DisciplinaMaterial> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDisciplinaMaterial(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDisciplinaMaterial(PathMetadata<?> metadata, PathInits inits) {
        this(DisciplinaMaterial.class, metadata, inits);
    }

    public QDisciplinaMaterial(Class<? extends DisciplinaMaterial> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.disciplina = inits.isInitialized("disciplina") ? new QDisciplina(forProperty("disciplina")) : null;
        this.material = inits.isInitialized("material") ? new QMaterial(forProperty("material")) : null;
    }

}

