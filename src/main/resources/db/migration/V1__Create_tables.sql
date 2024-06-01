
CREATE TABLE events(id VARCHAR(255) PRIMARY KEY,
                    name VARCHAR(255) NOT NULL,
                    date VARCHAR(255) NOT NULL,
                    location VARCHAR(255) NOT NULL
);

CREATE TABLE users (id VARCHAR(255) PRIMARY KEY,
                    name VARCHAR(255) NOT NULL,
                    id_events VARCHAR NOT NULL,
                    CONSTRAINT fk_events FOREIGN KEY (id_events) REFERENCES events(id)
                   );
