package com.evaluacion.tutum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.evaluacion.tutum.entity.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos,Integer> {

}
