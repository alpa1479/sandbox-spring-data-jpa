INSERT INTO authors(name)
VALUES ('Thomas Artis'),
       ('Rania Martinez'),
       ('Nathanial Snugg'),
       ('Kathryn Armatys'),
       ('Row Le Sarr'),
       ('Krystal Ryves'),
       ('Pat Cambridge');

INSERT INTO books(title, author_id)
VALUES ('The Oblong Box', (select id from authors where name = 'Thomas Artis')),
       ('Skin Deep', (select id from authors where name = 'Rania Martinez')),
       ('Summer Catch', (select id from authors where name = 'Nathanial Snugg')),
       ('The Missionaries', (select id from authors where name = 'Kathryn Armatys')),
       ('9 Star Hotel (Malon 9 Kochavim)', (select id from authors where name = 'Row Le Sarr')),
       ('Street Kings', (select id from authors where name = 'Krystal Ryves')),
       ('Squeeze', (select id from authors where name = 'Pat Cambridge'));
