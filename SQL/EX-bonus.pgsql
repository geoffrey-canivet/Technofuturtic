-- TABLE

-- CREATE TABLE student (
--     student_id SERIAL PRIMARY KEY,
--     first_name VARCHAR(50),
--     last_name VARCHAR(50),
--     birth_date DATE,
--     year_result INTEGER
-- );

CREATE TABLE employee (
    employee_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hire_date DATE,
    department VARCHAR(50)
);

CREATE TABLE product (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(100),
    price DECIMAL(10, 2)
);

CREATE TABLE customer (
    customer_id SERIAL PRIMARY KEY,
    customer_name VARCHAR(100),
    birth_date DATE,
    city VARCHAR(100)
);

CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_id INTEGER REFERENCES customer(customer_id),
    amount DECIMAL(10, 2),
    order_date DATE
);

-- DATA

INSERT INTO employee (first_name, last_name, hire_date, department) VALUES
('Alice', 'Taylor', '2010-06-15', 'HR'),
('Bob', 'Miller', '2015-02-22', 'IT'),
('Charlie', 'Wilson', '2020-11-12', 'Sales'),
('David', 'Moore', '2017-09-10', 'Marketing'),
('Eve', 'Clark', '2012-03-05', 'Finance');

INSERT INTO product (product_name, price) VALUES
('Laptop', 999.99),
('Smartphone', 599.99),
('Headphones', 49.99),
('Monitor', 199.99),
('Keyboard', 29.99);

INSERT INTO customer (customer_name, birth_date, city) VALUES
('Alice Johnson', '1985-12-15', 'Paris'),
('Bob Evans', '1990-05-12', 'New York'),
('Charlie Green', '1975-08-25', 'London'),
('David White', '2000-01-18', 'Berlin'),
('Eve Black', '1995-07-30', 'Tokyo');

INSERT INTO orders (customer_id, amount, order_date) VALUES
(1, 120.50, '2023-01-15'),
(2, 75.00, '2023-03-20'),
(3, 250.00, '2023-05-10'),
(4, 60.75, '2023-07-22'),
(5, 500.00, '2023-09-11');


-- SELECT, FROM, WHERE, et ORDER BY.
-- Exercice 1 : Trouver les étudiants ayant obtenu une note supérieure ou égale à 12

SELECT first_name, year_result
FROM student
WHERE year_result >= 12

-- Lister les employés qui ont été embauchés avant 2015

SELECT first_name, hire_date
FROM employee
WHERE TO_CHAR(hire_date, 'YYYY') > '2015'

-- Trouver les produits dont le prix est inférieur à 200

SELECT product_name, price
FROM product
WHERE price < 200

-- Exercice 4 : Sélectionner les clients nés après 1990 et triés par ville

SELECT customer_name, birth_date, city
FROM customer
WHERE birth_date > '01-01-1990'
ORDER BY city

-- Exercice 5 : Afficher les commandes dont le montant est supérieur ou égal à 100

SELECT order_id, amount
FROM orders
WHERE amount >= 100

-- Exercice 6 : Trouver les étudiants nés avant l'an 2000

SELECT first_name, birth_date
FROM student
WHERE birth_date < '01-01-2000'

-- Exercice 7 : Afficher les produits dont le prix est compris entre 50 et 500

SELECT product_name, price
FROM product
WHERE price BETWEEN 50 AND 500

-- Exercice 8 : Sélectionner les employés du département "IT" ou "HR"

SELECT first_name, department
FROM employee
WHERE department IN('IT', 'HR')

-- Exercice 9 : Trouver les clients vivant à Paris ou Londres

SELECT customer_name, city
FROM customer
WHERE city IN('Paris', 'London')

-- Exercice 10 : Lister les commandes effectuées après le 1er juin 2023

SELECT order_id, order_date
FROM orders
WHERE order_date > '01-06-2023'


-- fonctions SQL

-- Exercice 1 : Compter le nombre d'étudiants

SELECT COUNT(*)
FROM student

-- Exercice 2 : Trouver la moyenne des résultats annuels des étudiants

SELECT AVG(year_result) AS moyenne_resultats
FROM student

-- Exercice 3 : Calculer la somme des montants des commandes

SELECT SUM(amount)
FROM orders

-- Exercice 4 : Trouver la date d'embauche la plus ancienne

SELECT MAX(hire_date)
FROM employee

-- Exercice 5 : Afficher le produit le plus cher

SELECT MAX(price)
FROM product

-- Exercice 6 : Afficher les noms de clients en majuscules

SELECT UPPER(customer_name)
FROM customer

-- Exercice 7 : Calculer le nombre total de lettres dans chaque nom d'étudiant

SELECT first_name, last_name, LENGTH(first_name) + LENGTH(last_name) AS longueur_totale
FROM student;


CREATE TABLE Employés01 (
    id_employé INT,
    nom VARCHAR(100)
);

CREATE TABLE Salaires01 (
    id_employé INT,
    salaire DECIMAL
);

INSERT INTO Employés01 (id_employé, nom) VALUES (1, 'Alice'), (2, 'Bob'), (3, 'Charlie');
INSERT INTO Salaires01 (id_employé, salaire) VALUES (1, 3000), (3, 4500);

SELECT * FROM Employés01

SELECT * FROM Salaires01



-- employés et leurs salaires, mais uniquement ceux qui ont un salaire (INNER JOIN)
SELECT A.nom, B.salaire
FROM Employés01 AS A
INNER JOIN Salaires01 AS B
ON A.id_employé = B.id_employé;

-- tous les employés, même ceux sans salaire (LEFT JOIN - NULL)
SELECT A.nom, B.salaire
FROM Employés01 AS A
LEFT JOIN Salaires01 AS B
ON A.id_employé = B.id_employé;

-- enregistrements de la table Salaires, même s'ils ne correspondent pas à des employés (RIGHT JOIN)
SELECT A.nom, B.salaire
FROM Employés01 AS A
RIGHT JOIN Salaires01 AS B
ON A.id_employé = B.id_employé;

-- tous les employés et toutes les informations de salaire, qu'ils soient liés ou non (FULL JOIN)
SELECT A.nom, B.salaire
FROM Employés01 A
FULL JOIN Salaires01 B
ON A.id_employé = B.id_employé;


-- INNER JOIN : retourne seulement les correspondances.
-- LEFT JOIN : retourne tout de la table de gauche, et NULL si pas de correspondance.
-- RIGHT JOIN : retourne tout de la table de droite, et NULL si pas de correspondance.
-- FULL JOIN : retourne tout de deux tables, même sans correspondance.

CREATE TABLE Clients (
    id_client INT PRIMARY KEY,
    nom VARCHAR(100),
    ville VARCHAR(100)
);


CREATE TABLE Produits (
    id_produit INT PRIMARY KEY,
    nom_produit VARCHAR(100),
    prix DECIMAL(10, 2)
);

CREATE TABLE Commandes (
    id_commande INT PRIMARY KEY,
    id_client INT,
    id_produit INT,
    date_commande DATE,
    quantité INT,
    FOREIGN KEY (id_client) REFERENCES Clients(id_client),
    FOREIGN KEY (id_produit) REFERENCES Produits(id_produit)
);

INSERT INTO Clients (id_client, nom, ville)
VALUES
(1, 'Alice', 'Paris'),
(2, 'Bob', 'Lyon'),
(3, 'Charlie', 'Marseille'),
(4, 'David', 'Bordeaux');


INSERT INTO Produits (id_produit, nom_produit, prix)
VALUES
(1, 'Ordinateur', 1200.00),
(2, 'Smartphone', 800.00),
(3, 'Tablette', 600.00),
(4, 'Écouteurs', 50.00);


INSERT INTO Commandes (id_commande, id_client, id_produit, date_commande, quantité)
VALUES
(1, 1, 1, '2024-09-01', 1),
(2, 2, 2, '2024-09-02', 2),
(3, 1, 4, '2024-09-03', 3),
(4, 3, 3, '2024-09-04', 1),
(5, 2, 1, '2024-09-05', 1);

-- Trouve les commandes avec le nom du client et le nom du produit pour chaque commande.

SELECT Clients.nom, Produits.nom_produit, Commandes.quantité
FROM Commandes
INNER JOIN Clients ON Commandes.id_client = Clients.id_client
INNER JOIN Produits ON Commandes.id_produit = Produits.id_produit;


-- Affiche le nom des clients et, s’ils ont passé une commande, les informations sur cette 
-- commande. Affiche NULL pour les clients sans commande.

SELECT Clients.nom, Commandes.id_commande, Produits.nom_produit
FROM Clients
LEFT JOIN Commandes ON Clients.id_client = Commandes.id_client
LEFT JOIN Produits ON Commandes.id_produit = Produits.id_produit;

-- Affiche les informations sur les commandes et les produits associés, 
-- même si le produit a été supprimé de la table Produits.

SELECT Commandes.id_commande, Clients.nom, Produits.nom_produit
FROM Commandes
RIGHT JOIN Produits ON Commandes.id_produit = Produits.id_produit
LEFT JOIN Clients ON Commandes.id_client = Clients.id_client;
