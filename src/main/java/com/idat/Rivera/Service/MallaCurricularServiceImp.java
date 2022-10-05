package com.idat.Rivera.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Rivera.Model.MallaCurricular;
import com.idat.Rivera.Repository.CursoRepository;

public class MallaCurricularServiceImp implements MallaCurricularService {

	@Autowired
	private CursoRepository repositorio;
	
	@Override
	public void guardar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void actualizar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
