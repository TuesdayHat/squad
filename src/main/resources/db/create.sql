SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS squads (
    id int PRIMARY KEY auto_increment,
    name VARCHAR
);

CREATE TABLE IF NOT EXISTS heroes (
    id int PRIMARY KEY auto_increment,
    name VARCHAR,
    squadid INTEGER
);