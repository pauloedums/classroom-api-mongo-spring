package br.edu.impacta.classroomapimongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import br.edu.impacta.classroomapimongo.repositories.ProfessorRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProfessorRepository.class)
public class ClassroomApiMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassroomApiMongoApplication.class, args);
	}

}
