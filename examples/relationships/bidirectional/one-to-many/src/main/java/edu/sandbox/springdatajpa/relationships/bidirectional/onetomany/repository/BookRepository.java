package edu.sandbox.springdatajpa.relationships.bidirectional.onetomany.repository;

import edu.sandbox.springdatajpa.relationships.bidirectional.onetomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
