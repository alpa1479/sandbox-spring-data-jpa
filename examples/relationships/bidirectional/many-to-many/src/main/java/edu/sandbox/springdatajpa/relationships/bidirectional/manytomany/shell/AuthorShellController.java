package edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.shell;

import edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.repository.AuthorRepository;
import edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.shell.formatter.JsonPrettyFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class AuthorShellController {

    private final AuthorRepository authorRepository;
    private final JsonPrettyFormatter formatter;

    @ShellMethod(value = "find all authors", key = {"authors", "a"})
    public String findAllAuthors() {
        var authors = authorRepository.findAll();
        return formatter.format(authors);
    }

    @ShellMethod(value = "find author by id", key = {"author", "ai"})
    public String findAuthorById(@ShellOption(value = "-n", defaultValue = "1") long id) {
        return authorRepository.findById(id).map(formatter::format).orElse(null);
    }
}
