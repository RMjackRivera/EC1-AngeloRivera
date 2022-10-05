package com.idat.Rivera.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Rivera.Model.Curso;
import com.idat.Rivera.Repository.CursoRepository;

public class CursoServiceImp implements CursoService {

	@Autowired
	private CursoRepository repositorio;
	
	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
    repositorio.save(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		 repositorio.saveAndFlush(curso);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		 repositorio.deleteById(id);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Curso obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
