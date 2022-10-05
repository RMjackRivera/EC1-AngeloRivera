package com.idat.Rivera.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="universidad")
public class Universidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUnivarsidad;
	private String Universidad;
	public Integer getIdUnivarsidad() {
		return idUnivarsidad;
	}
	public void setIdUnivarsidad(Integer idUnivarsidad) {
		this.idUnivarsidad = idUnivarsidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	
}
