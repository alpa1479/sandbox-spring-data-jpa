package edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.repository;

import edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
