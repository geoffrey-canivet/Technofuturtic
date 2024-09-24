-- EX - 2.2.1
SELECT
    login, year_result 
FROM 
    student
WHERE year_result > 16;

-- EX - 2.2.2
SELECT 
    last_name, section_id
FROM 
    student
WHERE first_name IN('Georges');

-- EX - 2.2.3
SELECT
    last_name, year_result
FROM student
WHERE year_result BETWEEN 12 AND 16;

-- EX - 2.2.4
SELECT 
    last_name, section_id, year_result
FROM student
WHERE section_id NOT IN (1010, 1020, 1110 );

-- EX - 2.2.5
SELECT 
    last_name, section_id
FROM student
WHERE last_name LIKE '%r';

-- EX - 2.2.6
SELECT 
    last_name, year_result
FROM student 
WHERE last_name LIKE '__n%' AND year_result > 10;

-- EX - 2.2.7
SELECT 
    last_name, year_result
FROM student
WHERE year_result <= 3
ORDER BY year_result DESC;

-- EX 2.2.8
SELECT        
    last_name ||' '|| first_name AS "Nom complet",
    year_result
FROM student
WHERE section_id IN (1010)
ORDER BY first_name ASC;

-- EX 2.2.9
SELECT 
    last_name, section_id, year_result
FROM student
WHERE section_id IN (1010, 1020) 
    AND year_result NOT BETWEEN 12 AND 18
ORDER BY section_id ASC;

-- EX 2.2.10
SELECT
    last_name,
    section_id,
    year_result * 5 AS "Résultat sur 100"
FROM student
WHERE section_id::TEXT LIKE '13%' -- transforme section id en strind
  AND year_result * 5 <= 60          
ORDER BY "Résultat sur 100" DESC;  
