-- EX 2.7.1

SELECT last_name, first_name, section_id
FROM student 
WHERE section_id = ( SELECT section_id
                    FROM student
                    WHERE last_name = 'Roberts')
AND last_name != 'Roberts'
ORDER BY last_name ASC

-- EX 2.7.2

SELECT last_name, first_name, year_result
FROM student
WHERE year_result > (SELECT (AVG(year_result)*2)
                    FROM student)

-- EX 2.7.3   

SELECT SEC.section_id, SEC.section_name
FROM section AS SEC
LEFT JOIN professor AS PRO
ON SEC.section_id = PRO.section_id
WHERE professor_name IS NULL

-- EX 2.7.3 BIS


-- EX 2.7.4  

SELECT 
last_name, 
first_name, 
TO_CHAR(birth_date, 'MM') AS "Date de Naissance", 
year_result
FROM student
WHERE TO_CHAR(birth_date, 'MM') = (SELECT TO_CHAR(professor_hire_date, 'MM')
                    FROM professor
                    WHERE professor_name = 'giot')
ORDER BY year_result DESC

-- EX 2.7.5 

SELECT 
    ST.last_name,
    ST.first_name,
    ST.year_result
FROM 
    student AS ST
JOIN 
    grade AS GR 
ON ST.year_result BETWEEN GR.lower_bound AND GR.upper_bound
WHERE 
    ST.year_result BETWEEN 16 AND 17;

-- EX 2.7.5 BIS

-- EX 2.7.6

SELECT last_name, first_name, section_id
FROM student
WHERE section_id = (SELECT SEC.section_id
                    FROM section SEC
                    JOIN student AS STU
                        ON SEC.delegate_id = STU.student_id
                    WHERE STU.last_name = 'Marceau')


-- EX 2.7.7

SELECT SEC.section_id, SEC.section_name
FROM section AS SEC
JOIN student AS STU ON SEC.section_id = STU.section_id
GROUP BY SEC.section_id, SEC.section_name
HAVING COUNT(SEC.section_id) > 4;

-- EX 2.7.8




SELECT last_name, first_name, section_id
FROM student
WHERE 



-- SECTION >= 10 ET MOYENNE
SELECT STU.student_id, STU.last_name, STU.first_name, STU.section_id, STU.year_result
FROM student AS STU
JOIN section AS SEC
ON SEC.section_id = STU.section_id
WHERE STU.year_result = (
        SELECT MAX(ST.year_result)
        FROM student AS ST
        WHERE ST.section_id = STU.section_id
)



WITH BestStudents AS (
    SELECT STU.student_id, STU.last_name, STU.first_name, STU.section_id, STU.year_result
    FROM student AS STU
    JOIN section AS SEC ON STU.section_id = SEC.section_id
    WHERE STU.year_result = (
        SELECT MAX(ST.year_result)
        FROM student AS ST
        WHERE ST.section_id = STU.section_id
    )
),
ValidSections AS (
    SELECT section_id
    FROM student
    GROUP BY section_id
    HAVING AVG(year_result) >= 10
)
SELECT BS.last_name, BS.first_name, SEC.section_name, BS.year_result
FROM BestStudents AS BS
JOIN section AS SEC ON BS.section_id = SEC.section_id
WHERE BS.section_id IN (SELECT section_id FROM ValidSections);

git remote add origin https://github.com/geoffreycani/Technofuturtic