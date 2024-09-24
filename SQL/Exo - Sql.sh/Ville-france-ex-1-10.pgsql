SELECT * FROM villes_france_free

SELECT * FROM departement


-- Ex-1

SELECT ville_nom, ville_population_2012 
FROM villes_france_free
ORDER BY ville_population_2012 DESC
LIMIT 10;
-- Ex-2

SELECT ville_nom, ville_surface
FROM villes_france_free
ORDER BY ville_surface DESC
LIMIT 50

-- Ex-3

SELECT departement_code, departement_nom
FROM departement
WHERE departement_code LIKE '97%'
-- Ex-4

SELECT * 
FROM villes_france_free 
LEFT JOIN departement ON departement_code = ville_departement
ORDER BY ville_population_2012 DESC 
LIMIT 10

-- Ex-5
-- Obtenir la liste du nom de chaque département, associé à son code et du nombre de commune 
-- au sein de ces département, en triant afin d’obtenir en priorité les départements 
-- qui possèdent le plus de communes


SELECT departement.departement_nom
FROM departement


-- Ex-6
SELECT departement_nom, ville_departement, COUNT(*) AS nbr_items
FROM villes_france_free
LEFT JOIN departement ON departement_code = ville_departement
GROUP BY ville_departement, departement_nom
ORDER BY nbr_items DESC;

-- Ex-7

-- Ex-8

-- Ex-9

-- Ex-10
