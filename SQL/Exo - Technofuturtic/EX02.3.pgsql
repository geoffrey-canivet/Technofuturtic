-- EX 2.3.6

SELECT COUNT (*) 
FROM student;

SELECT student_id, login
FROM student;

SELECT MIN(year_result), MAX(birth_date)
FROM student
WHERE year_result > 12;

-- EX 2.3.7

SELECT AVG(year_result) FROM student;

-- EX 2.3.8

SELECT MAX(year_result) FROM student

-- EX 2.3.9

SELECT SUM(year_result) FROM student

-- EX 2.3.10

SELECT MIN(year_result) FROM student

-- EX 2.3.11

SELECT COUNT (*) FROM student;

-- EX 2.3.12

SELECT login, birth_date
FROM student
WHERE birth_date > '1970-01-01';

-- EX 2.3.13

SELECT login, last_name
FROM student
WHERE CHAR_LENGTH(last_name) >= 8;

-- EX 2.3.14

SELECT UPPER(last_name) AS "Nom de famille", first_name, year_result
FROM student
ORDER BY year_result ASC;

-- EX 2.3.15

SELECT first_name, last_name, login,
     LOWER(CONCAT(SUBSTRING(first_name FROM 1 FOR 2), '', LEFT(last_name, 4))) AS "Nouveau login"
FROM student
WHERE year_result BETWEEN 6 AND 10;

-- EX 2.3.16


SELECT first_name, last_name, 
    CONCAT(SUBSTRING(login FROM 1 FOR 3), '', 
           (CAST(TO_CHAR(CURRENT_TIMESTAMP, 'YYYY') AS INTEGER) - CAST(TO_CHAR(birth_date, 'YYYY') AS INTEGER))
    ) AS "Nouveau login"
FROM student
WHERE year_result IN (10, 12, 14);


-- EX 2.3.17

SELECT last_name, login, year_result
FROM student
WHERE LEFT(last_name, 1) = 'D' OR LEFT(last_name, 1) = 'M' OR LEFT(last_name, 1) = 'S' 
ORDER BY year_result ASC

-- EX 2.3.18

SELECT last_name, login, year_result
FROM student
WHERE year_result % 2 = 1 AND year_result > 10
ORDER BY year_result DESC

-- EX 2.3.19

SELECT COUNT(*) AS "Nb de noms de plus de 7 lettres"
FROM student
WHERE LENGTH(last_name) >= 7;

-- EX 2.3.20

SELECT last_name, year_result,
       CASE 
           WHEN year_result >= 12 THEN 'OK'
           ELSE 'KO'
       END AS statut
FROM student
WHERE birth_date < '1955-01-01';

-- EX 2.3.21

SELECT last_name, year_result,
CASE
    WHEN year_result < 10 THEN 'Inférieur'
    WHEN year_result = 10 THEN 'Neutre'
    WHEN year_result > 10 THEN 'Supérieur'
    ELSE 'ERREUR'
    END AS Statut
FROM student
WHERE CAST(TO_CHAR(birth_date, 'YYYY') AS INTEGER) BETWEEN 1955 AND 1965;

-- EX 2.3.22

SELECT last_name, year_result, TO_CHAR(birth_date, 'DD month YYYY') AS "literal_date"
FROM student
WHERE CAST(TO_CHAR(birth_date, 'YYYY') AS INTEGER) BETWEEN 1975 AND 1985;

-- EX 2.3.23

SELECT last_name, TO_CHAR(birth_date, 'MM') AS "Mois de naissance", year_result,
CASE
    WHEN year_result = 4 THEN NULL
    ELSE year_result
    END AS "Nouveau résultat"
FROM student
WHERE TO_CHAR(birth_date, 'MM') NOT IN ('12', '01', '02') AND year_result < 7
