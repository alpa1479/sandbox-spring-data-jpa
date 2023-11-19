package edu.sandbox.springdatajpa.relationships.unidirectional.onetomany.repository;

import edu.sandbox.springdatajpa.relationships.unidirectional.onetomany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
