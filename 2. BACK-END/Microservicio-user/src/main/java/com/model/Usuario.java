package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Clase, objeto, de la tabla Usuario.
 * 
 * @author Ismael Martin
 *
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	// =============================
	// Variables de la clase
	// =============================

	private static final long serialVersionUID = 1L;
	/**
	 * Primary Key
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "IDUSER", nullable = false, unique = true)
	private String idUser = "";
	/**
	 * Columnas
	 */
	@Column(name = "NOMBRE", nullable = false)
	private String nombre = "";

	@Column(name = "NUMUSER", nullable = false)
	private int numUser;

	@Column(name = "FECHAREGISTRO", nullable = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "Europe/Madrid") // formateo de
																										// fecha
	private Date fechaRegistro = null;

	// =============================
	// TRATAMIENTO de la clase
	// =============================
	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumUser() {
		return numUser;
	}

	public void setNumUser(int numUser) {
		this.numUser = numUser;
	}

	@Override
	public String toString() {
		return "Usuario [idUser=" + idUser + ", nombre=" + nombre + ", numUser=" + numUser + ", fechaRegistro="
				+ fechaRegistro + "]";
	}

}
