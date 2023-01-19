package com.evaluacion.tutum.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.tutum.entity.Calificaciones;
import com.evaluacion.tutum.repository.CalificacionesRepository;
import com.evaluacion.tutum.request.RequestCalificaciones;
import com.evaluacion.tutum.response.ResponseGenerico;
import com.evaluacion.tutum.response.getCalificacionesProjection;
import com.evaluacion.tutum.response.getCalificacionesResponse;

@Service
public class CalificacionesService {

	@Autowired
	CalificacionesRepository repository;

	public getCalificacionesResponse getCalificacionesbyId(int id) {
		getCalificacionesResponse response = new getCalificacionesResponse();

		double promedio = 0;
		double sumacalificaciones = 0;

		List<getCalificacionesProjection> listaCalificaciones = repository.findCalificacionesbyId(id);

		for (getCalificacionesProjection calificacion : listaCalificaciones) {
			sumacalificaciones += calificacion.getCalificacion();
		}

		promedio = sumacalificaciones / listaCalificaciones.size();

		response.setCalificaciones(listaCalificaciones);
		response.setPromedio(promedio);

		return response;
	}

	public ResponseGenerico altaCalificacion(RequestCalificaciones request) {

		ResponseGenerico response = new ResponseGenerico();

		try {
			Calificaciones calificacion = new Calificaciones();
			calificacion.setId_t_usuarios(request.getId_t_usuarios());
			calificacion.setId_t_materias(request.getId_t_materias());
			calificacion.setCalificacion(request.getCalificacion());
			calificacion.setFecha_registro(new Date());

			repository.saveAndFlush(calificacion);

			response.setSuccess("ok");
			response.setMsg("Calificacion registrada");

		} catch (Exception e) {
			response.setSuccess("ko");
			response.setMsg(e.getMessage());
			e.printStackTrace();

		}

		return response;

	}

	public ResponseGenerico actualizaCalificacion(RequestCalificaciones request) {

		ResponseGenerico response = new ResponseGenerico();

		try {
			Calificaciones calificacion = new Calificaciones();
			
			calificacion.setId_t_calificaciones(request.getId_t_calificaciones());
			calificacion.setId_t_materias(request.getId_t_materias());		
			calificacion.setId_t_usuarios(request.getId_t_usuarios());		
			calificacion.setCalificacion(request.getCalificacion());
			calificacion.setFecha_registro(new Date());

			repository.save(calificacion);

			response.setSuccess("ok");
			response.setMsg("Calificacion actualizada");

		} catch (Exception e) {
			response.setSuccess("ko");
			response.setMsg(e.getMessage());
			e.printStackTrace();

		}

		return response;

	}
	
	
	public ResponseGenerico eliminaCalificacion(int id) {

		ResponseGenerico response = new ResponseGenerico();

		try {
			repository.deleteById(id);

			response.setSuccess("ok");
			response.setMsg("calificacion eliminada");

		} catch (Exception e) {
			response.setSuccess("ko");
			response.setMsg(e.getMessage());
			e.printStackTrace();

		}

		return response;

	}

}
