INSERT INTO brewery(name, address, country, homepage, foundation_year)
VALUES ('Hartwall', 'Hiomotie 32, 00371 Helsinki', 'Suomi', 'hartwall.fi', 1836),
       ('Olvi', 'Olvitie 1-4, 74100 Iisalmi','Suomi','olvi.fi', 1887),
       ('Nokian Panimo', 'Nuijamiestentie 17, 37120 Nokia', 'Suomi', 'nokianpanimo.fi', 1991);

INSERT INTO brewery(name, address, country, homepage, foundation_year)
VALUES ('Hartwall', 'Helsinki', 'Suomi', 'hartwall.fi', 1836),
       ('Olvi', 'Iisalmi','Suomi','olvi.fi', 1887),
       ('Nokian Panimo', 'Nokia', 'Suomi', 'nokianpanimo.fi', 1991);

INSERT INTO beer(brewery_id, name, alcohol, calories)
VALUES(1, 'Heineken', 5.0, 42),
       (1, 'Fosters', 4.5, 38);