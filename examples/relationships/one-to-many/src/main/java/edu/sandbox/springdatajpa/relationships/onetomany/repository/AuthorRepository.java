package edu.sandbox.springdatajpa.relationships.onetomany.repository;

import edu.sandbox.springdatajpa.relationships.onetomany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
