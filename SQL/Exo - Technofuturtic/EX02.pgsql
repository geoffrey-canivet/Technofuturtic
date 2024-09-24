DROP TABLE IF EXISTS student;
CREATE TABLE student (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    last_name VARCHAR,
    first_name VARCHAR,
    login VARCHAR,
    date_n DATE,
    result INT
)

-- EX - 2.1.1

INSERT INTO student 
    VALUES
        (DEFAULT,'Amory', 'Lenisa', 'log1', '1996-04-03', 30),
        (DEFAULT,'Geoffrey', 'Canivet', 'log2', '1985-07-05', 40),
        (DEFAULT,'Laurent', 'Tibeau', 'log3', '2000-04-02', 50)

SELECT * FROM student

SELECT last_name, first_name AS fname
FROM student;

SELECT last_name AS lname, first_name AS fname 
FROM student;

SELECT last_name || '_' || first_name AS name
FROM student;

SELECT 
    last_name || '_' || first_name AS name, result*10 AS Final_result
FROM student;

-- EX - 2.1.2

SELECT 
    last_name || ' ' || first_name AS "Nom de l'étudiant",
    date_n AS "Date de naissance",
    login AS "Login",
    result*10 AS "Résultat de l'année"
FROM 
    student;

-- EX - 2.1.3

SELECT 
    last_name || ' ' || first_name AS "Nom de l'étudiant",
    id,
    date_n AS "Date de naissance"
FROM student;

SELECT 
    'L étudiant s appelle ' || last_name || ' ' || first_name || ' a le numéro ' || id || ' et est né le ' || date_n AS "présentation"
FROM student;

-- EX - 2.1.3

SELECT 
    id || ' | ' || last_name || ' | ' || first_name || ' | ' || login || ' | ' || date_n || ' | ' || result AS "Info Etudiant"
FROM student;
