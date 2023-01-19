package com.evaluacion.tutum.response;

public interface getCalificacionesProjection {
	
	Integer getId_t_usuario();
	Integer getId_t_calificacion();
	Integer getId_t_materia();
	String getNombre();
	String getApellido();
	String getMateria();
	Double getCalificacion();
	String getFecha_registro();

	
}
