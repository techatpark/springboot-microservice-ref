DROP TABLE IF EXISTS commment;

CREATE TABLE commment (
    id Bigserial PRIMARY KEY NOT NULL,
    message varchar(100) NOT NULL,
    topic varchar(100) NOT NULL
);