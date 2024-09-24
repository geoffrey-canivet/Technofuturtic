-- EX 2.4.6

SELECT section_id, COUNT(last_name)
FROM student
GROUP BY section_id, last_name

SELECT section_id, AVG(year_result)
FROM student
GROUP BY section_id
HAVING AVG(year_result) > 50

SELECT section_id, AVG(year_result)
FROM student
WHERE year_result > 10
GROUP BY section_id


-- EX 2.4.7

SELECT section_id, MAX(year_result) AS "Résultat Max"
FROM student
GROUP BY section_id

-- EX 2.4.8

SELECT section_id, AVG(year_result) AS "Moyenne"
FROM student
WHERE LEFT(section_id::CHAR(4), 2) IN ('10')
GROUP BY section_id

-- EX 2.4.9

SELECT 
TO_CHAR(birth_date, 'MM') AS "Mois de naissance", 
AVG(year_result) AS "Moyenne"
FROM student
WHERE TO_CHAR(birth_date, 'YYYY') BETWEEN '1970' AND '1985'
GROUP BY TO_CHAR(birth_date, 'MM')

-- EX 2.4.10

SELECT section_id, AVG(year_result) AS "Moyenne"
FROM student
GROUP BY section_id
HAVING COUNT(section_id) > 3

-- EX 2.4.11

SELECT section_id, AVG(year_result) AS "Moyenne", MAX(year_result) AS "resultat max"
FROM student
GROUP BY section_id
HAVING AVG(year_result) > 8