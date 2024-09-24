DROP TABLE IF EXISTS entreprise;

CREATE TABLE entreprise (
    id BIGINT GENERATED ALWAYS AS IDENTITY UNIQUE
);

DROP TABLE IF EXISTS personne;
CREATE TABLE personne (
    -- COLONNE
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    numero_nat CHAR(13) NOT NULL,
    nom VARCHAR(50) DEFAULT 'N/A',
    prenom VARCHAR(50) DEFAULT 'N/A',
    date_naissance DATE NOT NULL,
    heure_naissance TIME,
    date_heure_deces TIMESTAMP,
    taille INT,
    poids DECIMAL(5,2),
    salaire MONEY,
    est_marie BOOLEAN,
    -- FK CLES ETRANGERES
    entreprise_id BIGINT,
    -- CONTRAINTE
    CONSTRAINT UQ_nat UNIQUE (numero_nat),
    CONSTRAINT PK_personne PRIMARY KEY (id),
    CONSTRAINT CK_date_naissance CHECK (date_naissance <= CURRENT_DATE),
    CONSTRAINT CK_taille CHECK (taille > 0),
    CONSTRAINT CK_poids CHECK (poids > 0),
    CONSTRAINT CK_salaire CHECK (salaire > 0::MONEY),
    CONSTRAINT FK_personne_entreprise FOREIGN KEY (entreprise_id)
        REFERENCES entreprise (id)
);






INSERT INTO personne
VALUES
    (DEFAULT, '123456789123', 'Geoffrey', 'Canivet', '1985-07-17', '18:23:56', NULL, 180, 100, 6500, false);





SELECT * FROM entreprise;
SELECT * FROM personne;