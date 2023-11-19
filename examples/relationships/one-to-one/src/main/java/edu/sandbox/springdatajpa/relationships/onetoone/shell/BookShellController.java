package edu.sandbox.springdatajpa.relationships.onetoone.shell;

import edu.sandbox.springdatajpa.relationships.onetoone.repository.BookRepository;
import edu.sandbox.springdatajpa.relationships.onetoone.shell.formatter.JsonPrettyFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class BookShellController {

    private final BookRepository bookRepository;
    private final JsonPrettyFormatter formatter;

    @ShellMethod(value = "Find all books", key = {"findBooks", "fb"})
    public String findAllBooks() {
        var books = bookRepository.findAll();
        return formatter.format(books);
    }

    @ShellMethod(value = "Find book by id", key = {"findBook", "fbi"})
    public String findBookById(@ShellOption(value = "-n", defaultValue = "1") long id) {
        return bookRepository.findById(id).map(formatter::format).orElse(null);
    }
}
