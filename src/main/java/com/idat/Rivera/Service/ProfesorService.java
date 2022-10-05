package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.MallaCurricular;
import com.idat.Rivera.Model.Profesor;

public interface ProfesorService {
	
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar (Integer id );
	List<Profesor> listar ();
	Profesor obtener (Integer id);

}
