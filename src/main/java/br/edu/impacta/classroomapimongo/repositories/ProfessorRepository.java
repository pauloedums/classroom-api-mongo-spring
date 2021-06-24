package br.edu.impacta.classroomapimongo.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.impacta.classroomapimongo.models.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, UUID> {
	
	public Long countById(UUID id);
	
}
