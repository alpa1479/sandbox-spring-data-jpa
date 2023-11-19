DROP TABLE IF EXISTS books_authors;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

CREATE TABLE authors
(
    id   BIGSERIAL   NOT NULL PRIMARY KEY,
    name VARCHAR(64) NOT NULL
);

CREATE TABLE books
(
    id    BIGSERIAL    NOT NULL PRIMARY KEY,
    title VARCHAR(128) NOT NULL
);

CREATE TABLE books_authors
(
    id        BIGSERIAL NOT NULL PRIMARY KEY,
    book_id   BIGINT    NOT NULL REFERENCES books (id),
    author_id BIGINT    NOT NULL REFERENCES authors (id),
    UNIQUE (book_id, author_id)
);
