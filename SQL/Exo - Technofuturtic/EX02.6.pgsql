-- EX 2.6.1 A
SELECT 
    C.course_name,
    S.section_name,
    P.professor_name
FROM
    course AS C,
    section AS S,
    professor AS P
WHERE 
    C.professor_id = P.professor_id
AND 
    P.section_id = S.section_id
-- EX 2.6.1 B
SELECT 
    C.course_name,
    S.section_name,
    P.professor_name
FROM
    course AS C
    JOIN professor AS P ON C.professor_id = P.professor_id
    JOIN section AS S ON P.section_id = S.section_id

-- EX 2.6.2

SELECT 
    SE.section_id,
    SE.section_name,
    ST.last_name
FROM
    student AS ST 
JOIN section AS SE ON SE.delegate_id = ST.student_id

-- EX 2.6.3

SELECT
    SE.section_id,
    SE.section_name,
    PR.professor_name
FROM 
    section AS SE
LEFT JOIN 
    professor AS PR ON PR.section_id = SE.section_id;


-- EX 2.6.4

SELECT
    SE.section_id,
    SE.section_name,
    PR.professor_name
FROM 
    section AS SE
JOIN 
    professor AS PR ON PR.section_id = SE.section_id;

-- EX 2.6.5

SELECT 
    ST.last_name,
    ST.year_result,
    GR.grade
FROM 
    student AS ST
JOIN 
    grade AS GR ON ST.year_result BETWEEN GR.lower_bound AND GR.upper_bound
WHERE 
    ST.year_result >= 12;

-- EX 2.6.6

SELECT PRO.professor_name, SEC.section_name, COU.course_name, COU.course_ects
FROM professor AS PRO 
JOIN section AS SEC
    ON PRO.section_id = SEC.section_id
LEFT JOIN course AS COU
ON Pro.professor_id = COU.professor_id
ORDER BY COU.course_ects DESC

-- EX 2.6.7

SELECT PRO.professor_id, SUM(COU.course_ects)
FROM professor AS PRO
LEFT JOIN course AS COU
ON PRO.professor_id = COU.professor_id
GROUP 
