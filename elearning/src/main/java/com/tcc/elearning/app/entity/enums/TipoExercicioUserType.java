package com.tcc.elearning.app.entity.enums;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;

import com.tcc.elearning.app.usertype.ImmutableUserType;


public class TipoExercicioUserType extends ImmutableUserType{
	private static final long serialVersionUID = 1L;

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
			throws HibernateException, SQLException {
		Integer value = rs.getInt(names[0]);
		if(rs.wasNull()){
			return null;
		}
		return TipoExercicio.fromCodigo(value);
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index)
			throws HibernateException, SQLException {
		if (value==null){
			st.setNull(index, Types.TINYINT);
		}else{
			st.setInt(index, ((TipoExercicio) value).getCodigo());
		}
	}

	@Override
	public Class<?> returnedClass() {
		return TipoExercicio.class;
	}

	@Override
	public int[] sqlTypes() {
		return new int[]{ Types.TINYINT };
	}
	
}
