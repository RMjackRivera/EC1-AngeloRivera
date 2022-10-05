package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Rivera.Model.Curso;

@Repository

public interface CursoRepository extends JpaRepository<Curso, Integer> {

	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar (Integer id );
	List<Curso> listar ();
	Curso obtener (Integer id);
}
