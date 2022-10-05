package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Universidad;



public interface UniversidadService {
	
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar (Integer id );
	List<Universidad> listar ();
	Universidad obtener (Integer id);


}
