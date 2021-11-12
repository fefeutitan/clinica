package com.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.model.Medico;
import com.clinica.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;

	@GetMapping
	public List<Medico>  listar(){
		return medicoRepository.findAll();
		
	}


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Medico adicionar(@RequestBody Medico medico) {
		return medicoRepository.save(medico);
		
	}
	

}
