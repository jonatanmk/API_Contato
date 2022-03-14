package com.escape.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escape.crud.model.Contato;
import com.escape.crud.services.ContatoServices;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "http://localhost:3000")
public class ContatoResource {
	
	@Autowired
	private ContatoServices service;
	
	@GetMapping
	public List<Contato> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Contato findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Contato save(@RequestBody Contato obj) {
		return service.save(obj);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Contato obj) {
		service.save(obj);
	}
}
