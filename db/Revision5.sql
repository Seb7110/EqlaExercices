--  CREATE DATABASE Biblio2;
DROP DATABASE IF EXISTS biblio2;

CREATE DATABASE biblio2;

USE biblio2;

CREATE TABLE theme (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(30) NOT NULL
)\p;

CREATE TABLE auteur (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    date_naissance VARCHAR(30) NOT NULL,
    nationalite VARCHAR(25) NOT NULL

)\p;


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
)\p;


CREATE TABLE auteur_livre(
        auteur_id INT UNSIGNED NOT NULl,
    livre_id INT UNSIGNED NOT NULL,
PRIMARY KEY (auteur_id,livre_id),
    FOREIGN KEY (auteur_id) REFERENCES auteur(id),
    FOREIGN KEY (livre_id) REFERENCES livre(id)
    )\p;
 

CREATE TABLE lecteur (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(25) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    date_naissance VARCHAR(25) NOT NULL
)\p;

CREATE TABLE emprunt (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    date_debut VARCHAR(25) NOT NULL,
    date_fin VARCHAR(25) NULL,
    rendu BOOLEAN NOT NULL DEFAULT FALSE,
    livre_id INT UNSIGNED NOT NULL,
    lecteur_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (livre_id) REFERENCES livre(Id),
    FOREIGN KEY (lecteur_id) REFERENCES lecteur(id)
)\p;

INSERT INTO
    theme (libelle)
VALUES
    ('Programmation') \p;

INSERT INTO
    theme (libelle)
VALUES
    ('Roman') \p;

INSERT INTO
    theme (libelle)
VALUES
    ('Science-fiction') \p;

INSERT INTO
    theme (libelle)
VALUES
    ('Thriller') \p;

INSERT INTO
    theme (libelle)
VALUES
    ('Policier') \p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Nothomb', 'Amélie', '1967-13-08', 'Belge') \p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Hugo', 'Victor', '1802-26-02', 'Français') \p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    (
        'Christie',
        'Agatha',
        '1890-15-09',
        'Britannique'
    ) \p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
('Chattam', 'Maxime', '1976-19-02', 'Français') \p;

INSERT INTO
    auteur (nom, prenom, date_naissance, nationalite)
VALUES
    ('Connelly', 'Michael', '1956-21-07', 'Américain') \p;

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
        
    )\p;

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
    )\p;

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
    )\p;
Insert Into auteur_livre(
    auteur_id,
    livre_id
)
VALUES
(
1,
1
)\p;
Insert Into auteur_livre(
    auteur_id,
    livre_id
)
VALUES (
    5,
    3
);
Insert Into auteur_livre(
    auteur_id,
    livre_id
)
VALUES(
    3,
    2
);



    INSERT INTO lecteur (nom, prenom, date_naissance) VALUES ('Baloge', 'Sébastien', '1982-23-08');
    INSERT INTO lecteur (nom, prenom, date_naissance) VALUES ('Baloge', 'Aude', '1987-02-02');
    INSERT INTO lecteur (nom, prenom, date_naissance) VALUES ('Baloge', 'Cédric', '1993-13-03');
    INSERT INTO lecteur (nom, prenom, date_naissance) VALUES ('Caillault', 'Mylène', '1962-18-10');
    INSERT INTO lecteur (
        
        nom, prenom, date_naissance) VALUES ('Guignard', 'Noélie', '2013-13-08');

INSERT INTO emprunt (date_debut,  livre_id, lecteur_id) VALUES ('2022-13-04',  3, 5);
INSERT INTO emprunt (date_debut, date_fin,  livre_id, lecteur_id) VALUES ('2014-12-02', '2014-20-02',  2, 3);
INSERT INTO emprunt (date_debut, date_fin,  livre_id, lecteur_id) VALUES ('2022-05-12', NULL, 1, 4);
