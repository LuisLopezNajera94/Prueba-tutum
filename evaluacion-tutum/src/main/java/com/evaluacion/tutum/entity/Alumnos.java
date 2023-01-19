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
@Table(name="t_alumnos")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Alumnos {
	
	@Id
    @GeneratedValue
	private Integer id_t_usuarios;
	private String nombre;
	private String ap_paterno;
	private String ap_materno;
	private Integer activo;


}
