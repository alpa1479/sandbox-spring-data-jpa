package edu.sandbox.springdatajpa.relationships.unidirectional.onetomany.repository;

import edu.sandbox.springdatajpa.relationships.unidirectional.onetomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
