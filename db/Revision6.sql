--  CREATE DATABASE Biblio2;
DROP DATABASE IF EXISTS biblio2;

CREATE DATABASE biblio2;

USE biblio2;

CREATE TABLE theme (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(30) NOT NULL
) \ p;

CREATE TABLE auteur (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    date_naissance DATE NOT NULL,
    nationalite VARCHAR(25) NOT NULL
) \ p;

CREATE TABLE livre (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(250) NOT NULL,
    isbn INT NOT NULL,
    langue VARCHAR(30) NOT NULL,
    annee_publication INT NOT NULL,
    nombre_page INT NOT NULL,
    nombre_exemplaire INT NOT NULL,
    theme_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (theme_id) REFERENCES theme(id)
) \ p;

CREATE TABLE auteur_livre(
    auteur_id INT UNSIGNED NOT NULl,
    livre_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (auteur_id, livre_id),
    FOREIGN KEY (auteur_id) REFERENCES auteur(id),
    FOREIGN KEY (livre_id) REFERENCES livre(id)
) \ p;

CREATE TABLE lecteur (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(25) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    date_naissance DATE NOT NULL
) \ p;

CREATE TABLE exemplaire (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    reference INT NOT NULL UNIQUE,
    rayon INT NOT NULL,
    date_acquisition DATE NOT NULL,
    etat VARCHAR(25) NOT NULL,
    est_perdu boolean NOT NULL DEFAULT FALSE,
    livre_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (livre_id) REFERENCES livre(Id)
) \ p;

CREATE TABLE emprunt (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    date_debut DATE NOT NULL,
    date_fin DATE NULL,
    rendu BOOLEAN NOT NULL DEFAULT FALSE,
    exemplaire_id INT UNSIGNED NOT NULL,
    lecteur_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (exemplaire_id) REFERENCES exemplaire(Id),
    FOREIGN KEY (lecteur_id) REFERENCES lecteur(id)
) \ p;

INSERT INTO
    theme (libelle)
VALUES
    ('Programmation') \ p;

INSERT INTO
    theme (libelle)
VALUES
    ('Roman') \ p;

INSERT INTO
    theme (libelle)
VALUES
    ('Science-fiction') \ p;

INSERT INTO
    theme (libelle)
VALUES
    ('Thriller') \ p;

INSERT INTO
    theme (libelle)
VALUES
    ('Policier') \ p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Nothomb', 'Amélie', '1967-08-13', 'Belge') \ p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Hugo', 'Victor', '1802-02-26', 'Français') \ p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    (
        'Christie',
        'Agatha',
        '1890-09-15',
        'Britannique'
    ) \ p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Chattam', 'Maxime', '1976-02-19', 'Français') \ p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Connelly', 'Michael', '1956-07-21', 'Américain') \ p;

INSERT INTO
    livre (
        titre,
        isbn,
        langue,
        annee_publication,
        nombre_page,
        nombre_exemplaire,
        theme_id
    )
VALUES
    (
        'Soif',
        22264438,
        'Française',
        2019,
        162,
        4,
        3
    ) \ p;

INSERT INTO
    livre (
        titre,
        isbn,
        langue,
        annee_publication,
        nombre_page,
        nombre_exemplaire,
        theme_id
    )
VALUES
    (
        'Les Comtemplations',
        22530149,
        'française',
        2002,
        608,
        7,
        5
    ) \ p;

INSERT INTO
    livre (
        titre,
        isbn,
        langue,
        annee_publication,
        nombre_page,
        nombre_exemplaire,
        theme_id
    )
VALUES
    (
        'The black echo',
        0115613,
        'Anglaise américaine',
        1992,
        362,
        11,
        5
    ) \ p;

Insert Into
    auteur_livre(auteur_id, livre_id)
VALUES
    (1, 1) \ p;

Insert Into
    auteur_livre(auteur_id, livre_id)
VALUES
    (5, 3);

Insert Into
    auteur_livre(auteur_id, livre_id)
VALUES
    (3, 2);

INSERT INTO
    lecteur (nom, prenom, date_naissance)
VALUES
    ('Baloge', 'Sébastien', '1982-08-23');

INSERT INTO
    lecteur (nom, prenom, date_naissance)
VALUES
    ('Baloge', 'Aude', '1987-02-02');

INSERT INTO
    lecteur (nom, prenom, date_naissance)
VALUES
    ('Baloge', 'Cédric', '1993-03-13');

INSERT INTO
    lecteur (nom, prenom, date_naissance)
VALUES
    ('Caillault', 'Mylène', '1962-10-18');

INSERT INTO
    lecteur (nom, prenom, date_naissance)
VALUES
    ('Guignard', 'Noélie', '2013-08-13');

INSERT INTO
    exemplaire (
        reference,
        rayon,
        date_acquisition,
        etat,
        livre_id
    )
VALUES
    (
        1,
        18,
        '2002-02-15',
        '"couverture manquante',
        1
    ) \ p;

INSERT INTO
    exemplaire (
        reference,
        rayon,
        date_acquisition,
        etat,
        livre_id
    )
VALUES
    (2, 14, '2013-08-26', 'bon', 2) \ p;

INSERT INTO
    exemplaire (
        reference,
        rayon,
        date_acquisition,
        etat,
        livre_id
    )
VALUES
    (3, 9, '2011-01-08', 'pages écornées', 3) \ p;

INSERT INTO
    emprunt (date_debut, exemplaire_id, lecteur_id)
VALUES
    ('2022-04-13', 3, 5);

INSERT INTO
    emprunt (date_debut, date_fin, exemplaire_id, lecteur_id)
VALUES
    ('2014-12-02', '2014-02-20', 2, 3);

INSERT INTO
    emprunt (date_debut, date_fin, exemplaire_id, lecteur_id)
VALUES
    ('2022-05-12', NULL, 1, 4);

ALTER TABLE
    livre DROP COLUMN nombre_exemplaire;

ALTER TABLE
    livre
ADD
    is_audiobook BOOLEAN NOT NULL DEFAULT FALSE;