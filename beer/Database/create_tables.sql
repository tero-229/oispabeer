CREATE TABLE brewery (
    id                  SERIAL              PRIMARY KEY,
    name                VARCHAR(30)         NOT NULL,
    address             CHAR(25),
    country             VARCHAR(25),
    homepage            VARCHAR(25),
    foundation_year     INT
);

CREATE TABLE beer (
    id                  SERIAL              PRIMARY KEY,
    beer_id             INT,
    name                VARCHAR(30)         NOT NULL,
    alcohol             DECIMAL(6, 2)       NOT NULL,
    price_per_liter     DECIMAL(10, 4)      NOT NULL,
    calories            INT                 NOT NULL
);