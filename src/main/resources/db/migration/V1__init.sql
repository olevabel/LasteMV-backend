
CREATE TABLE IF NOT EXISTS competitor(
id BIGSERIAL NOT NULL PRIMARY KEY,
firstname VARCHAR(100) NOT NULL,
lastname VARCHAR(100) NOT NULL,
age INT NOT NULL,
gender VARCHAR(10) NOT NULL,
county VARCHAR(100) NOT NULL,
parent_phone VARCHAR(100) NOT NULL,
parent_email VARCHAR(100) NOT NULL,
referee_id BIGINT);

CREATE TABLE IF NOT EXISTS referee (
id BIGSERIAL NOT NULL PRIMARY KEY,
name VARCHAR(100) NOT NULL);

CREATE TABLE IF NOT EXISTS result (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  competitor_id BIGINT  REFERENCES competitor(id),
  sprint VARCHAR(100),
  long_jump VARCHAR(100),
  ball VARCHAR(100),
  medicine_ball VARCHAR(100),
  volleyball VARCHAR(100),
  bike VARCHAR(100),
  box_climbing VARCHAR(100),
  basketball VARCHAR(100),
  football VARCHAR(100),
  running VARCHAR(100)
);