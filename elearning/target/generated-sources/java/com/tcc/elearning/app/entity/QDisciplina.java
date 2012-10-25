package com.tcc.elearning.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QDisciplina is a Querydsl query type for Disciplina
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDisciplina extends EntityPathBase<Disciplina> {

    private static final long serialVersionUID = 88866488;

    public static final QDisciplina disciplina = new QDisciplina("disciplina");

    public final ListPath<Curso, QCurso> cursos = this.<Curso, QCurso>createList("cursos", Curso.class, QCurso.class);

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Material, QMaterial> materiais = this.<Material, QMaterial>createList("materiais", Material.class, QMaterial.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QDisciplina(String variable) {
        super(Disciplina.class, forVariable(variable));
    }

    public QDisciplina(Path<? extends Disciplina> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDisciplina(PathMetadata<?> metadata) {
        super(Disciplina.class, metadata);
    }

}

