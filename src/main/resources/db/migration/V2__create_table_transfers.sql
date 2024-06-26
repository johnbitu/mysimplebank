CREATE TABLE transfers (
    id UUID PRIMARY KEY UNIQUE NOT NULL,
    value NUMERIC(15, 2) NOT NULL,
    payer_id UUID NOT NULL,
    payee_id UUID NOT NULL,
    CONSTRAINT fk_payer FOREIGN KEY (payer_id) REFERENCES users(id),
    CONSTRAINT fk_payee FOREIGN KEY (payee_id) REFERENCES users(id)
)