package com.noturna.turistica.agencia.backendAgencia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.noturna.turistica.agencia.backendAgencia.model.Destinos;
import com.noturna.turistica.agencia.backendAgencia.repository.DestinosRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DestinosController {
	
	@Autowired
	private DestinosRepository destinosRepository;

	@GetMapping("/destinos")
	public List<Destinos> getAllDestinos() {
		return destinosRepository.findAll();
	}

	@GetMapping("/destinos/{idDestino}")
	public ResponseEntity<Destinos> getDestinosById(@PathVariable Long idDestino) {
	    Optional<Destinos> destinoOptional = destinosRepository.findById(idDestino);

	    if (destinoOptional.isPresent()) {
	        return ResponseEntity.ok(destinoOptional.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}
