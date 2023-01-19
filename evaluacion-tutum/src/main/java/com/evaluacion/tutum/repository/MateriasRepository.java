package com.evaluacion.tutum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.evaluacion.tutum.entity.Materias;

@Repository
public interface MateriasRepository extends JpaRepository<Materias,Integer> {

}
