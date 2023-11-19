package edu.sandbox.springdatajpa.relationships.onetoone.shell;

import edu.sandbox.springdatajpa.relationships.onetoone.repository.AuthorRepository;
import edu.sandbox.springdatajpa.relationships.onetoone.shell.formatter.JsonPrettyFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class AuthorShellController {

    private final AuthorRepository authorRepository;
    private final JsonPrettyFormatter formatter;

    @ShellMethod(value = "Find all authors", key = {"findAuthors", "fa"})
    public String findAllAuthors() {
        var authors = authorRepository.findAll();
        return formatter.format(authors);
    }

    @ShellMethod(value = "Find author by id", key = {"findAuthor", "fai"})
    public String findAuthorById(@ShellOption(value = "-n", defaultValue = "1") long id) {
        return authorRepository.findById(id).map(formatter::format).orElse(null);
    }
}
