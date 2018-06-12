package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Usuario;
import com.service.Servicio;

/**
 * 
 * @author Ismael Martin
 *
 */
@RestController
public class Controller {

	@Autowired 
	private Servicio servicio;
	
	@RequestMapping("/")
	public ResponseEntity<List<Usuario>> getAllUsuarios(){
		return servicio.getAllUsuario();
	}
	
	@RequestMapping("/controlMicroB")
	public ResponseEntity<List<Usuario>> getAllUsuarios2(){
		return servicio.getAllUsuario();
	}
	
}
