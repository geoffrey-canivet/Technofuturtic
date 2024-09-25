-- CREATION TABLE + TYPAGE

CREATE TABLE T_table (
    id SERIAL PRIMARY KEY,           -- Clé primaire de type entier avec auto-incrémentation
    name VARCHAR(100) NOT NULL,      -- Chaîne de caractères de longueur variable (max 100)
    age INTEGER,                     -- Entier
    email TEXT UNIQUE,               -- Texte, avec contrainte d'unicité
    is_active BOOLEAN DEFAULT TRUE,  -- Booléen avec valeur par défaut
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- Date et heure, valeur par défaut à l'heure actuelle
    salary NUMERIC(10, 2),           -- Nombre avec précision (10 chiffres, 2 après la virgule)
    birth_date DATE,                 -- Date
    bio TEXT NOT NULL,               -- Texte sans limite de longueur
    -- CONSTRAINT PK_MTN PRIMARY KEY (name, age)
);
CREATE TABLE T_extended_table (
    user_id UUID DEFAULT gen_random_uuid(),   -- Identifiant unique universel avec valeur par défaut générée automatiquement
    document BYTEA,                           -- Fichier binaire (par exemple, image, PDF)
    preferences JSONB,                        -- Données JSON stockées de manière optimisée
    ip_address INET,                          -- Adresse IP
    mac_address MACADDR,                      -- Adresse MAC
    tags TEXT[],                              -- Tableau de chaînes de caractères
    price NUMERIC(10, 2),                     -- Nombre décimal pour un prix
    location POINT,                           -- Coordonnées géographiques (x, y)
    elevation REAL                            -- Nombre à virgule flottante pour une altitude
);

-- INSERTION DE DONNEES

INSERT INTO T_table (name, age, email, is_active, salary, birth_date, bio)
VALUES
('Leonardo da Vinci', 67, 'leonardo@renaissance.com', TRUE, 75000.50, '1452-04-15', 'Inventeur, peintre et scientifique italien.'),
('Michelangelo', 88, 'michelangelo@sculptor.com', TRUE, 80000.00, '1475-03-06', 'Sculpteur et peintre de la Renaissance.'),
('Vincent van Gogh', 37, 'vincent@postimpressionism.com', FALSE, 60000.00, '1853-03-30', 'Peintre post-impressionniste néerlandais.'),
('Pablo Picasso', 91, 'pablo@cubism.com', TRUE, 120000.00, '1881-10-25', 'Peintre et sculpteur espagnol, cofondateur du cubisme.'),


SELECT * FROM T_table