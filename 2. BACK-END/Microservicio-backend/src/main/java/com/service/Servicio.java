package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.model.ModelBackend;
import com.repository.Repositorio;

/**
 * 
 * @author Ismael Martin
 *
 */
@Service
public class Servicio {

	@Autowired
	private Repositorio repositorio;
	
	/**
	 * Obtiene todos las filas de la tabla Usuario
	 * @return Listado de usuarios
	 */
	public ResponseEntity<List<ModelBackend>> getAllUsuario() {
		
		List<ModelBackend> contenido = (List<ModelBackend>) repositorio.findAll();
		ResponseEntity<List<ModelBackend>> respuesta;
		
		if(!contenido.isEmpty()) {
			respuesta = new ResponseEntity<>(contenido,HttpStatus.OK);
		}else {
			respuesta = new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
		}
		
		return respuesta;
	}
}
