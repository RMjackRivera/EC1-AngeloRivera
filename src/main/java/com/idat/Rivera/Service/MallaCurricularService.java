package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Curso;
import com.idat.Rivera.Model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardar(MallaCurricular mallacurricular);
	void actualizar(MallaCurricular mallacurricular);
	void eliminar (Integer id );
	List<MallaCurricular> listar ();
	MallaCurricular obtener (Integer id);

}
