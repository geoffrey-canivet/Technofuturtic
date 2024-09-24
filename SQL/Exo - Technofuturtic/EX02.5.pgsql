-- EX 2.5.6

SELECT 
    section_id, 
    course_id, 
    AVG(year_result) AS "moyenne"
FROM student
WHERE section_id IN(1010, 1320)
GROUP BY ROLLUP (section_id, course_id)
ORDER BY section_id, course_id ASC

-- EX 2.5.7

SELECT 
    course_id, 
    section_id, 
    AVG(year_result) AS "Moyenne"
FROM student
WHERE section_id IN(1010, 1320)
GROUP BY CUBE (section_id, course_id)