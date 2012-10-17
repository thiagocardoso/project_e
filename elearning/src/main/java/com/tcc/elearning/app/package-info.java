@TypeDefs({
		@TypeDef(name = "tipoExercicio", typeClass = TipoExercicioUserType.class, defaultForType = TipoExercicio.class),
})

package com.tcc.elearning.app;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.tcc.elearning.app.entity.enums.TipoExercicio;
import com.tcc.elearning.app.entity.enums.TipoExercicioUserType;

