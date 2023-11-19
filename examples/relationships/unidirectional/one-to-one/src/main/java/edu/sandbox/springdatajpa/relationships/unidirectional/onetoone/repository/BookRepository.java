package edu.sandbox.springdatajpa.relationships.unidirectional.onetoone.repository;

import edu.sandbox.springdatajpa.relationships.unidirectional.onetoone.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
