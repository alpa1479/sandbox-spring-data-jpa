package edu.sandbox.springdatajpa.relationships.unidirectional.manytomany.repository;

import edu.sandbox.springdatajpa.relationships.unidirectional.manytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
