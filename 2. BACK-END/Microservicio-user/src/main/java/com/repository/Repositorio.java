package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Usuario;

/**
 * 
 * @author Ismael Martin
 *
 */
public interface Repositorio extends CrudRepository<Usuario, String>{

}
