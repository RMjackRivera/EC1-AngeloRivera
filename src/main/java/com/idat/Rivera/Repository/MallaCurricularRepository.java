package com.idat.Rivera.Repository;

import java.util.List;

import com.idat.Rivera.Model.MallaCurricular;

public interface MallaCurricularRepository {
	void guardar(MallaCurricular mallacurricular);
	void actualizar(MallaCurricular mallacurricular);
	void eliminar (Integer id );
	List<MallaCurricular> listar ();
	MallaCurricular obtener (Integer id);

}
