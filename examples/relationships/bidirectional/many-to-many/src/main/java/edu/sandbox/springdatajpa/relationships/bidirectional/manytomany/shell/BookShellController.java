package edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.shell;

import edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.repository.BookRepository;
import edu.sandbox.springdatajpa.relationships.bidirectional.manytomany.shell.formatter.JsonPrettyFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class BookShellController {

    private final BookRepository bookRepository;
    private final JsonPrettyFormatter formatter;

    @ShellMethod(value = "find all books", key = {"books", "b"})
    public String findAllBooks() {
        var books = bookRepository.findAll();
        return formatter.format(books);
    }

    @ShellMethod(value = "find book by id", key = {"book", "bi"})
    public String findBookById(@ShellOption(value = "-n", defaultValue = "1") long id) {
        return bookRepository.findById(id).map(formatter::format).orElse(null);
    }
}
