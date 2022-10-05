package com.idat.Rivera.Repository;

import java.util.List;

import com.idat.Rivera.Model.Profesor;

public interface ProfesorRepository {
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar (Integer id );
	List<Profesor> listar ();
	Profesor obtener (Integer id);

}
