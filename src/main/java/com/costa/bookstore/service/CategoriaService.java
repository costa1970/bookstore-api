package com.costa.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.bookstore.domain.Categoria;
import com.costa.bookstore.repositories.CategoriaRepository;
import com.costa.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
