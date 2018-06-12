package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.ModelBackend;

/**
 * 
 * @author Ismael Martin
 *
 */
public interface Repositorio extends CrudRepository<ModelBackend, String>{

}
