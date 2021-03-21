package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfazServicio.IPersonaService;
import com.example.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private IPersonaService service;
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Persona>personas= service.listar();
		model.addAttribute("personas", personas);
		return "index";
	} 
}
