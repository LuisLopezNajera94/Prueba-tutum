package com.evaluacion.tutum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.evaluacion.tutum.entity.Calificaciones;
import com.evaluacion.tutum.response.getCalificacionesProjection;



@Repository
public interface CalificacionesRepository extends JpaRepository<Calificaciones,Integer> {
	
	
	@Query( value = "SELECT A.id_t_usuarios as id_t_usuario,C.id_t_calificaciones as id_t_calificacion,M.id_t_materias as id_t_materia,A.nombre,A.ap_paterno AS Apellido,M.nombre as Materia,C.calificacion,TO_CHAR(C.fecha_registro, 'dd/mm/yyyy') as fecha_registro FROM \r\n"
			+ "t_calificaciones C INNER JOIN t_alumnos A ON C.id_t_usuarios = A.id_t_usuarios\r\n"
			+ "INNER JOIN t_materias M ON C.id_t_materias = M.id_t_materias\r\n"
			+ "Where A.id_t_usuarios = :id", nativeQuery = true)
	List<getCalificacionesProjection> findCalificacionesbyId(@Param("id") Integer id);
	
}
