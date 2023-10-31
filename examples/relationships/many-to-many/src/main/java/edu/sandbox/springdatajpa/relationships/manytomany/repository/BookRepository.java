package edu.sandbox.springdatajpa.relationships.manytomany.repository;

import edu.sandbox.springdatajpa.relationships.manytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
