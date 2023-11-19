package edu.sandbox.springdatajpa.relationships.unidirectional.manytomany.repository;

import edu.sandbox.springdatajpa.relationships.unidirectional.manytomany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
