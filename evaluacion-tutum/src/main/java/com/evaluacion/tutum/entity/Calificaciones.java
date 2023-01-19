package com.evaluacion.tutum.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="t_calificaciones")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Calificaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_t_calificaciones;
	private Integer id_t_materias;
	private Integer id_t_usuarios;
	private Double calificacion;
	private Date fecha_registro;


}
