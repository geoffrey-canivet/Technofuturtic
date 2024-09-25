DROP TABLE IF EXISTS T_produit_pdt;
CREATE TABLE T_produit_pdt (
    pdt_id INT PRIMARY KEY,
    pdt_ref_Mag VARCHAR(20),
    pdt_code INT,
    pdt_prix MONEY,
    pdt_tva INT,
    pdt_ryn INT,
    pdt_fbq INT,
    CONSTRAINT FK_tva FOREIGN KEY(pdt_tva)
        REFERENCES T_taux_tva (tva_id),
    CONSTRAINT FK_rayon FOREIGN KEY(pdt_ryn)
        REFERENCES T_rayon_ryn (ryn_id),
    CONSTRAINT FK_fabriquant FOREIGN KEY(pdt_fbq)
        REFERENCES T_fabriquant_fbq
);

DROP TABLE IF EXISTS T_taux_tva;
CREATE TABLE T_taux_tva (
    tva_id INT PRIMARY KEY
);

DROP TABLE IF EXISTS T_fabriquant_fbq;
CREATE TABLE T_fabriquant_fbq (
    fbq_id INT PRIMARY KEY
);

DROP TABLE IF EXISTS T_rayon_ryn;
CREATE TABLE T_rayon_ryn (
    ryn_id INT PRIMARY KEY
);

SELECT * FROM T_produit_pdt;
SELECT * FROM T_taux_tva;
SELECT * FROM T_fabriquant_fbq;
SELECT * FROM T_rayon_ryn;