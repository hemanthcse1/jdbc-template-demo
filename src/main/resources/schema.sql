CREATE TABLE products (
                          id INT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          description VARCHAR(500),
                          quantity INT NOT NULL,
                          price DOUBLE NOT NULL
);