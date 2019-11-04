CREATE TABLE brewery (
    id                  SERIAL              PRIMARY KEY,
    name                VARCHAR(30)         NOT NULL,
    address             CHAR(25),
    country             VARCHAR(25),
    homepage            VARCHAR(25),
    foundation_year     INT
);