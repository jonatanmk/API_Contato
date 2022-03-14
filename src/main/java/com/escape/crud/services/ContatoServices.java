package com.escape.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escape.crud.model.Contato;
import com.escape.crud.repositories.ContatoRepository;

@Service
public class ContatoServices {
	
	@Autowired
	private ContatoRepository repository;
	
	public Contato save(Contato obj) {
		return repository.save(obj);
	}
	
	public List<Contato> findAll() {
		return repository.findAll();
	}
	
	public Contato findById(Long id) {
		return repository.findById(id).get();
	}
		
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	public void update(Contato obj) {
		repository.save(obj);
	}
	
}
