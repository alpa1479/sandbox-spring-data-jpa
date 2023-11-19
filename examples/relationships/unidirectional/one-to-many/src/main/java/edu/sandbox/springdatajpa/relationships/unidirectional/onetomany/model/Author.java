package edu.sandbox.springdatajpa.relationships.unidirectional.onetomany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    // In case we want unidirectional mapping from Author side:
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "author_id")
//    private Set<Book> books = new LinkedHashSet<>();
}

