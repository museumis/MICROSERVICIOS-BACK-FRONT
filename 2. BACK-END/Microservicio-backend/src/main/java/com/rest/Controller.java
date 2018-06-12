package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.ModelBackend;
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
	
	@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
	@RequestMapping(value="/",
			method=RequestMethod.GET,
			produces="application/json"
			
	)
	public ResponseEntity<List<ModelBackend>> getAllUsuarios(){
		return servicio.getAllUsuario();
	}
	
	@RequestMapping("/controlMicroA")
	public ResponseEntity<List<ModelBackend>> getAllUsuarios2(){
		return servicio.getAllUsuario();
	}
	
}
