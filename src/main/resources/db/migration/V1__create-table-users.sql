CREATE TABLE users (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    cpf FLOAT NOT NULL,
    email TEXT NOT NULL,
    password TEXT NOT NULL
)