package com.example.demo.modelo;

import  javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name= "persona")

public class Persona {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	private int numero;
	private String descripcion;
	
	
	public Persona() {
		
	}


	public Persona(int id, String nombre, String apellido, int numero, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		this.descripcion = descripcion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
