-- EX - 2.1.1

SELECT * FROM student

SELECT last_name, first_name AS fname
FROM student;

SELECT last_name AS lname, first_name AS fname 
FROM student;

SELECT last_name || '_' || first_name AS name
FROM student;

SELECT 
    last_name || '_' || first_name AS name, year_result*10 AS Final_year_result
FROM student;

-- EX - 2.1.2

SELECT 
    last_name || ' ' || first_name AS "Nom de l'étudiant",
    birth_date AS "Date de naissance",
    login AS "Login",
    year_result AS "Résultat de l'année"
FROM 
    student;

-- EX - 2.1.3

SELECT 
    last_name || ' ' || first_name AS "Nom de l'étudiant",
    student_id,
    birth_date AS "Date de naissance"
FROM student;

-- EX - 2.1.3

SELECT 
    student_id || ' | ' || first_name || ' | ' || last_name || ' | ' || login || ' | ' || birth_date || ' | ' || year_result AS "Info Etudiant"
FROM student;

SELECT CONCAT(student_id, ' | ', first_name, ' | ', last_name, ' | ', login, ' | ', birth_date, ' | ', year_result ) AS "Info Etudiant"
FROM student;

