DROP TABLE IF EXISTS T_maintenance_MTN;

CREATE TABLE T_MAINTENANCE_MTN (
    jour VARCHAR NOT NULL,
    machine VARCHAR NOT NULL,
    numero INTEGER NOT NULL,
    vitesse INTEGER,
    temperateur INTEGER,
    heure TIME NOT NULL,
    evenement VARCHAR NOT NULL,
    CONSTRAINT PK_MTN PRIMARY KEY (jour, machine, heure)
);

INSERT INTO t_maintenance_mtn
    VALUES('mardi','machine 1', 2, 10, 65, '12:02:00', 'nom de leven' );

SELECT * FROM T_maintenance_MTN;