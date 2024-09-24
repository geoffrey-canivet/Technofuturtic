DROP TABLE IF EXISTS T_office;
CREATE TABLE T_office (
    office_id INTEGER,
    office_address VARCHAR(30),
    CONSTRAINT PK_office PRIMARY KEY (office_id) -- DEFINI CLE PRIMAIRE
);
DROP TABLE IF EXISTS T_course;
CREATE TABLE T_course (
    crs_code CHAR(8) NOT NULL PRIMARY KEY, -- DEFINI CLE PRIMAIRE
    crs_name VARCHAR(30),
    CONSTRAINT UK_crs UNIQUE (crs_name) -- EMPECHE DOUBLON
);
DROP TABLE IF EXISTS T_professor;
CREATE TABLE T_professor (
    prf_id INTEGER NOT NULL PRIMARY KEY, -- DEFINI CLE PRIMAIRE
    prf_name VARCHAR(30),
    prf_course CHAR(8),
    CONSTRAINT FK_course FOREIGN KEY (prf_course) -- fait référence à une autre table
        REFERENCES T_course (crs_name) -- FK FAIS REF A TABLE T_course 
            ON DELETE SET NULL, -- SI SUPPRIMER met à NULL les valeurs correspondantes dans la table enfant
    office_id INT REFERENCES T_office, -- La colonne office_id dans la table T_professor fait référence à la clé primaire office_id dans la table T_office,
    CONSTRAINT prf_name UNIQUE (prf_name) -- UNIQUE sur la colonne prf_name impose que chaque nom de professeur soit unique dans la table T_professor
    
);

SELECT * FROM T_office;
SELECT * FROM T_course;
SELECT * FROM T_professor;

