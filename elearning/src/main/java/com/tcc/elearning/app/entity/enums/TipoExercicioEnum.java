package com.tcc.elearning.app.entity.enums;

public enum TipoExercicioEnum {
	DISSERTATIVO(0, "Dissertativo"),
	MULTIPLA_ESCOLHA(1, "Múltipla Escolha"),
	RELACIONE_COLUNAS(2, "Relacione Colunas");

	private Integer codigo;
	private String descricao;
	
	TipoExercicioEnum(Integer codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static TipoExercicioEnum valueOf(int i){
		switch(i){
		case 0: return DISSERTATIVO;
		case 1: return MULTIPLA_ESCOLHA;
		case 2: return RELACIONE_COLUNAS;
		default: return null;
		}
	}
	
	@Override
	public String toString() {
		return descricao;
	}	
}
