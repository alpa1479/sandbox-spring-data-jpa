package edu.sandbox.springdatajpa.relationships.bidirectional.onetomany.repository;

import edu.sandbox.springdatajpa.relationships.bidirectional.onetomany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
