package com.evaluacion.tutum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="t_materias")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Materias {
	
	@Id
    @GeneratedValue
	private Integer id_t_materias;
	private String nombre;
	private Integer activo;


}
