package com.example.demo.servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IPersona;
import  com.example.demo.interfazServicio.IPersonaService;
import com.example.demo.modelo.Persona;

@Service
public class PersonaServicio implements IPersonaService{

	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
