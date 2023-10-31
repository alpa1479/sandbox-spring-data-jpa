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
       ('Squeeze', (select id from authors where name = 'Pat Cambridge')),
       ('Old San Francisco', (select id from authors where name = 'Thomas Artis')),
       ('Pauly Shore Is Dead', (select id from authors where name = 'Thomas Artis')),
       ('Wayward Bus', (select id from authors where name = 'Rania Martinez')),
       ('Brimstone and Treacle', (select id from authors where name = 'Rania Martinez')),
       ('The Walking Stick', (select id from authors where name = 'Rania Martinez')),
       ('Eight Below', (select id from authors where name = 'Kathryn Armatys')),
       ('Riders of the Purple Sage', (select id from authors where name = 'Kathryn Armatys')),
       ('Harry and Tonto', (select id from authors where name = 'Row Le Sarr'));
