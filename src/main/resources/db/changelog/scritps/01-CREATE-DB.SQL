CREATE TABLE cars.engine
(
    ID BIGINT NOT NULL PRIMARY KEY,
    HORSE_POWER INTEGER NOT NULL,
    CAPACITY DECIMAL(10,2) NOT NULL
);

CREATE TABLE cars.car
(
    ID BIGINT NOT NULL PRIMARY KEY,
    MODEL CHARACTER VARYING(255) NOT NULL,
    YEAR INTEGER NOT NULL,
    IS_DRIVEABLE BOOLEAN NOT NULL,
    ENGINE_ID BIGINT NOT NULL REFERENCES cars.engine(ID)
);

CREATE SEQUENCE cars.engine_seq
    INCREMENT 1
    START 1000;

CREATE SEQUENCE cars.car_seq
    INCREMENT 1
    START 1000;


CREATE TABLE naruto.jutsu
(
    ID BIGINT NOT NULL PRIMARY KEY,

)

CREATE TABLE naruto.character
(
    ID BIGINT NOT NULL PRIMARY KEY,
    NAME CHARACTER VARYING(255) NOT NULL,
    VILLAGE CHARACTER VARYING(255) NOT NULL,
    AGE BIGINT NOT NULL,
    RANK CHARACTER VARYING(255) NOT NULL,
    CHAKRA_ID BIGINT NOT NULL REFERENCES naruto.chakra(id),
)