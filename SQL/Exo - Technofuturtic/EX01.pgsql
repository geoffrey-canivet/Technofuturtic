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


SELECT * FROM personne;


SELECT * FROM T_professor;
SELECT * FROM T_office;
SELECT * FROM T_course;
SELECT * FROM T_maintenance;


CREATE TABLE T_office(
    office_id INTEGER,
    office_adresse VARCHAR(30),

    CONSTRAINT PK_office PRIMARY KEY (office_id)
);

CREATE TABLE T_course(
    crs_code CHAR(8) NOT NULL PRIMARY KEY,
    crs_name VARCHAR(30),
    CONSTRAINT UQ_crs UNIQUE (crs_name)
);

CREATE TABLE T_professor(
    prf_id INTEGER NOT NULL PRIMARY KEY,
    prf_name VARCHAR(30),
    prf_course VARCHAR(8)

    CONSTRAINT FK_course REFERENCES T_course (crs_code) ON DELETE SET NULL,
    office_id INTEGER REFERENCES T_office,
    CONSTRAINT prf_name UNIQUE (prf_name)
);



CREATE TABLE T_maintenance(
    maint_jour CHAR(3) NOT NULL,
    maint_machine VARCHAR(30) NOT NULL,
    maint_num INTEGER,
    maint_vit INTEGER,
    maint_temp INTEGER,
    maint_heure TIME NOT NULL,
    maint_even VARCHAR(50) NOT NULL,

    CONSTRAINT PK_MTN PRIMARY KEY (maint_jour, maint_machine, maint_heure)

)

INSERT INTO T_maintenance
VALUES('aaa', 'aaa', 1, 2, 3)

DROP TABLE IF EXISTS T_maintenance;

