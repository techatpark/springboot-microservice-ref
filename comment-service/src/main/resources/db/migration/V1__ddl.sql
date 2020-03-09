DROP TABLE IF EXISTS comments;
CREATE TABLE comments(
  id INT NOT NULL AUTO_INCREMENT,
  text VARCHAR (255),
  created_by VARCHAR (255),
  topic VARCHAR (255),
  comments_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (comments_id) REFERENCES comments(id),
  CONSTRAINT valid_root CHECK(
    topic is NOT NULL
    OR comments_id is NOT NULL
  ),
    INDEX user_index(created_by),
    INDEX topic_index(topic)
);
