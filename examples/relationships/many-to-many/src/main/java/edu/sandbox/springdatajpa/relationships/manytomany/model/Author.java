package edu.sandbox.springdatajpa.relationships.manytomany.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

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
     *
     * Many Authors to Many Books
     * Bidirectional relationship
     * Owner of the relationship is Book, linked by 'authors' field in Book class
     *
     * FetchType.EAGER because otherwise in our codebase we will receive 'org.hibernate.LazyInitializationException: could not initialize proxy - no Session'
     */
    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    private Set<Book> books = new LinkedHashSet<>();
}
