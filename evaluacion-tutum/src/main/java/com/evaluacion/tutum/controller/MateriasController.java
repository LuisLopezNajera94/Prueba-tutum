package com.evaluacion.tutum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluacion.tutum.response.getMateriasResponse;
import com.evaluacion.tutum.service.MateriasService;

@RestController
@CrossOrigin(origins = "*")
public class MateriasController {

	@Autowired
	MateriasService service;
	
	@GetMapping(value = "/materias")
	public List<getMateriasResponse> getMaterias(){
		
		List<getMateriasResponse> materias = service.getMaterias();
				
		return materias;
    }

}
