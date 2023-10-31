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
    id        BIGSERIAL    NOT NULL PRIMARY KEY,
    title     VARCHAR(128) NOT NULL,
    author_id BIGINT       NOT NULL REFERENCES authors (id)
);