package edu.sandbox.springdatajpa.relationships.bidirectional.onetoone.repository;

import edu.sandbox.springdatajpa.relationships.bidirectional.onetoone.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
