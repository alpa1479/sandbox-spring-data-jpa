package edu.sandbox.springdatajpa.relationships.bidirectional.onetoone.repository;

import edu.sandbox.springdatajpa.relationships.bidirectional.onetoone.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
