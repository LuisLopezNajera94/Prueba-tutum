package com.evaluacion.tutum.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class getCalificacionesResponse {
	
	private List<getCalificacionesProjection> calificaciones;
	private Double promedio;

}
