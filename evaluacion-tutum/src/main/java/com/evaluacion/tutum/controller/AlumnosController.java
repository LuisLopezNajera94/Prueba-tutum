package com.evaluacion.tutum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.tutum.response.getAlumnosResponse;
import com.evaluacion.tutum.service.AlumnosService;

@RestController
@CrossOrigin(origins = "*")
public class AlumnosController {

	@Autowired
	AlumnosService service;
	
	@GetMapping(value = "/alumnos")
	public List<getAlumnosResponse> getAlumnos(){
		
		List<getAlumnosResponse> alumnos = service.getAlumnos();
				
		return alumnos;
    }

}
