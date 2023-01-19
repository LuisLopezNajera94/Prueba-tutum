package com.evaluacion.tutum.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestCalificaciones {
	
	private int id_t_calificaciones;
	private int id_t_materias; 
	private int id_t_usuarios;
	private double calificacion;

}
