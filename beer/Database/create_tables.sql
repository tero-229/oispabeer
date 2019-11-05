CREATE TABLE brewery (
    id                  SERIAL              PRIMARY KEY,
    name                VARCHAR(30)         NOT NULL UNIQUE,
    address             VARCHAR(256),
    country             VARCHAR(25),
    homepage            VARCHAR(25),
    foundation_year     INT
);

CREATE TABLE beer (
    id                  SERIAL              PRIMARY KEY,
    brewery_id             INT,
    name                VARCHAR(30)         NOT NULL,
    alcohol             DECIMAL(6, 2)       NOT NULL,
    calories            INT                 NOT NULL,
    likes               INT,
    FOREIGN KEY(brewery_id) REFERENCES brewery(id),
    UNIQUE (name, alcohol)
);

CREATE TABLE beerType (
    id                  SERIAL               PRIMARY KEY,
    name                VARCHAR(20)          NOT NULL

);

CREATE TABLE beer_beerType (
    beer_id             INT             REFERENCES beer(id),
    beerType_id         INT             REFERENCES beerType(id),
    PRIMARY KEY(beer_id, beerType_id)
);

CREATE TABLE ingredients (
    id                  SERIAL              PRIMARY KEY,
    name                VARCHAR(20)         NOT NULL
);

CREATE TABLE beer_ingredients (
    beer_id             INT             REFERENCES beer(id),
    ingredients_id      INT             REFERENCES ingredients(id),
    PRIMARY KEY(beer_id, ingredients_id)
);

CREATE TABLE packageType (
    id                  SERIAL              PRIMARY KEY,
    type                VARCHAR(20),
    size                INT,
    price               DECIMAL(6, 2)
);

CREATE TABLE beer_packageType (
    beer_id         INT                 REFERENCES beer(id),
    packageType_id  INT                 REFERENCES packageType(id),
    PRIMARY KEY(beer_id, packageType_id)
);






