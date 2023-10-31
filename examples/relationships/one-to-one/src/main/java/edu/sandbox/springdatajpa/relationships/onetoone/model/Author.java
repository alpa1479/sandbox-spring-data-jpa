package edu.sandbox.springdatajpa.relationships.onetoone.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    /*
     * To avoid 'com.fasterxml.jackson.databind.JsonMappingException: Infinite recursion (StackOverflowError)' during deserialization for bidirectional relationship
     * use @JsonIgnore or @JsonManagedReference/@JsonBackReference
     */
    @JsonManagedReference
    /*
     * One Author to One Book
     * Bidirectional relationship
     * Owner of the relationship is Book, linked by 'author' field in Book class
     */
    @OneToOne(mappedBy = "author")
    private Book book;
}
