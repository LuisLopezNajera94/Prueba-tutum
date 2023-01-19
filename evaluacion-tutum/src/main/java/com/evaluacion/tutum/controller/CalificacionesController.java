package com.evaluacion.tutum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.tutum.request.RequestCalificaciones;
import com.evaluacion.tutum.response.ResponseGenerico;
import com.evaluacion.tutum.response.getCalificacionesResponse;
import com.evaluacion.tutum.service.CalificacionesService;



@RestController
@CrossOrigin(origins = "*")
public class CalificacionesController {

	@Autowired
	CalificacionesService service;
	
	
	@GetMapping(value = "/calificaciones")
	public getCalificacionesResponse getCalificacionesbyId(@RequestParam(name = "id") Integer id){
        return service.getCalificacionesbyId(id);
    }
	
	
	@PostMapping(value = "/altaCalificaion")
	public ResponseGenerico altaCalificacion(@RequestBody RequestCalificaciones request){
	    return service.altaCalificacion(request);
	}
	
	@PutMapping(value = "/actualizaCalificaion")
	public ResponseGenerico actualizaCalificacion(@RequestBody RequestCalificaciones request){
	    return service.actualizaCalificacion(request);
	}
	
	@DeleteMapping(value = "/eliminaCalificaciones")
	public ResponseGenerico eliminaCalificacion(@RequestParam(name = "id") Integer id){
        return service.eliminaCalificacion(id);
    }
	
	

}
