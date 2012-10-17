package com.tcc.elearning.app.entity.enums;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public enum TipoExercicio {
	DISSERTATIVO(0, "Dissertativo"),
	MULTIPLA_ESCOLHA(1, "Múltipla Escolha"),
	RELACIONE_COLUNAS(2, "Relacione Colunas");

	private static final Map<Integer, TipoExercicio> valueMap;
	
	static{
		Builder<Integer, TipoExercicio> builder = ImmutableMap.builder();

		for(TipoExercicio tipoExercicio : values()){
			builder.put(tipoExercicio.codigo, tipoExercicio);
		}

		valueMap = builder.build();
	}	
	
	private Integer codigo;
	private String descricao;
	
	TipoExercicio(Integer codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static TipoExercicio fromCodigo(Integer codigo){
		return valueMap.get(codigo);
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return descricao;
	}	
}
