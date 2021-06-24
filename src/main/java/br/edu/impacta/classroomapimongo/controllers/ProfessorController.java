package br.edu.impacta.classroomapimongo.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.impacta.classroomapimongo.models.Professor;
import br.edu.impacta.classroomapimongo.repositories.ProfessorRepository;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
	
	@Autowired
	ProfessorRepository repo;
	
	@GetMapping
	public List<Professor> all(){
		return repo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Professor create(@RequestBody Professor prof) {
		
		prof.setId(UUID.randomUUID());
		repo.save(prof);
		
		return prof;
	}
}
