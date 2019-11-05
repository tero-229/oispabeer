
-- Lisätään tietokantaan muutaman panimon tiedot
INSERT INTO brewery(id, name, address, country, homepage, foundation_year)
VALUES (1, 'Hartwall', 'Hiomotie 32, 00371 Helsinki', 'Suomi', 'hartwall.fi', 1836),
       (2, 'Olvi', 'Olvitie 1-4, 74100 Iisalmi','Suomi','olvi.fi', 1887),
       (3, 'Nokian Panimo', 'Nuijamiestentie 17, 37120 Nokia', 'Suomi', 'nokianpanimo.fi', 1991);


-- Lisätään panimoille muutama olut! HUOM! brewery_id voi olla eri kun tässä!
INSERT INTO beer(id, brewery_id, name, alcohol, calories, likes)
VALUES(11, 1, 'Heineken', 5.0, 42, 0),
       (12, 3, 'Keisari IPA', 5.1, 46, 0),
       (13, 1, 'Fosters', 4.5, 38, 0),
       (14, 2, 'Halko', 4.5, 37, 0);

--Lisätään beertype oluille
INSERT INTO beertype(id, name)
VALUES(21, 'lager'),
       (22, 'vehnäolut'),
       (23, 'tumma olut'),
       (24, 'IPA'),
       (25, 'pils'),
       (26, 'APA');

-- Lisätään oluille oluttyyppejä
INSERT INTO beer_beertype(beer_id, beertype_id)
VALUES(14, 21),
       (13, 21),
       (11, 21),
       (12, 24);

INSERT INTO ingredients(id, name)
VALUES(31, 'ohramallas'),
       (32, 'ohratärkkelys'),
       (33, 'humala');

INSERT INTO beer_ingredients(beer_id, ingredients_id)
VALUES(14, 31),
       (14, 32),
       (14, 33),
       (13, 33),
       (13, 31),
       (11, 33),
       (11, 31),
       (12, 33),
       (12, 31);

INSERT INTO packagetype(id, type, size)
VALUES(41, 'tölkki', 330),
       (42, 'tölkki', 500),
       (43, 'lasipullo', 330),
       (44, 'lasipullo', 500);

INSERT INTO beer_packagetype(beer_id, packagetype_id)
VALUES(14, 41),
       (14, 42),
       (13, 41),
       (13, 42),
       (11, 41),
       (11, 42),
       (11, 43),
       (12, 42);


