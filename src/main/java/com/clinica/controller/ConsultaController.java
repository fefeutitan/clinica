package com.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.model.Consulta;
import com.clinica.repository.ConsultaRepository;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@GetMapping
	public List<Consulta> listar(){
		return consultaRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Consulta marcar(@RequestBody Consulta consulta) {
		return consultaRepository.save(consulta);
		
	}

	/*
	
	@DeleteMapping("/{consultaId}")
	public Consulta desmarcar(Consulta consulta) {
		return consultaRepository.delete(consulta);
		
	}
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Void> remover(@PathVariable Long clienteId) {
		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		
		catalogoClienteService.excluir(clienteId);
		
		return ResponseEntity.noContent().build();
	}*/
	
	//public Consulta remarcar //UPDATE

}
