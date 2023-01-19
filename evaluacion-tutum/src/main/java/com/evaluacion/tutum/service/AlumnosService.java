package com.evaluacion.tutum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.tutum.entity.Alumnos;
import com.evaluacion.tutum.repository.AlumnosRepository;
import com.evaluacion.tutum.response.getAlumnosResponse;

@Service
public class AlumnosService {

	@Autowired
	AlumnosRepository repository;
	
	public List<getAlumnosResponse> getAlumnos(){
		
		List<Alumnos> alumnos = repository.findAll();
		List<getAlumnosResponse> lista = new ArrayList<getAlumnosResponse>();
		
		
		for (Alumnos alumno : alumnos) {
			getAlumnosResponse alumnoResponse = new getAlumnosResponse(); 

			alumnoResponse.setId(alumno.getId_t_usuarios());
			alumnoResponse.setNombre(alumno.getNombre() + " " + alumno.getAp_paterno() + " " + alumno.getAp_materno());
			
			lista.add(alumnoResponse);
		
		}
		
		return lista;
	}
	
}
