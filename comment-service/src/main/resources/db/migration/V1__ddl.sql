DROP TABLE IF EXISTS comment;

CREATE TABLE comment (
    id Bigserial PRIMARY KEY NOT NULL,
    message varchar(100) NOT NULL,
    topic varchar(100) NOT NULL
);