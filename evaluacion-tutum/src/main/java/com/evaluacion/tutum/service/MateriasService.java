package com.evaluacion.tutum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.tutum.entity.Materias;
import com.evaluacion.tutum.repository.MateriasRepository;

import com.evaluacion.tutum.response.getMateriasResponse;

@Service
public class MateriasService {

	@Autowired
	MateriasRepository repository;

	public List<getMateriasResponse> getMaterias() {

		List<Materias> materias = repository.findAll();
		List<getMateriasResponse> lista = new ArrayList<getMateriasResponse>();

		for (int i = 0; i < materias.size(); i++) {
			getMateriasResponse materiaResponse = new getMateriasResponse();

			materiaResponse.setId(materias.get(i).getId_t_materias());
			materiaResponse.setNombre(materias.get(i).getNombre());

			lista.add(materiaResponse);
		}

		return lista;
	}

}
