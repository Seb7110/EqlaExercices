--  CREATE DATABASE Biblio2;
DROP DATABASE IF EXISTS Biblio2;

CREATE DATABASE Biblio2;

USE Biblio2;

CREATE TABLE Theme (
    Id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Libelle VARCHAR(30) NOT NULL
)\p;

CREATE TABLE Auteur (
    Id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(30) NOT NULL,
    Prenom VARCHAR(30) NOT NULL,
    DateNaissance VARCHAR(30) NOT NULL,
    Nationalite VARCHAR(25) NOT NULL

)\p;


CREATE TABLE Livre (
    Id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Titre VARCHAR(250) NOT NULL,
    Isbn INT NOT NULL,
    Langue VARCHAR(30) NOT NULL,
    AnneePublication INT NOT NULL,
    NombrePage INT NOT NULL,
    NombreExemplaire INT NOT NULL,
    IdTheme INT UNSIGNED NOT NULL,
    FOREIGN KEY (IdTheme) REFERENCES Theme(Id)
)\p;


CREATE TABLE AuteurLivre(
        IdAuteur INT UNSIGNED NOT NULl,
    IdLivre INT UNSIGNED NOT NULL,
Primary Key (IdAuteur,IdLivre),
    FOREIGN KEY (IdAuteur) REFERENCES Auteur(Id),
    FOREIGN KEY (IdLivre) REFERENCES Livre(Id)
    )\p;
 

CREATE TABLE Lecteur (
    Id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(25) NOT NULL,
    Prenom VARCHAR(30) NOT NULL,
    DateNaissance VARCHAR(25) NOT NULL
)\p;

CREATE TABLE Emprunt (
    Id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DateDebut VARCHAR(25) NOT NULL,
    DateFin VARCHAR(25) NULL,
    Rendu BOOLEAN NOT NULL DEFAULT FALSE,
    IdLivre INT UNSIGNED NOT NULL,
    IdLecteur INT UNSIGNED NOT NULL,
    FOREIGN KEY (IdLivre) REFERENCES Livre(Id),
    FOREIGN KEY (IdLecteur) REFERENCES Lecteur(Id)
)\p;

insert into
    Theme (Libelle)
values
    ('Programmation') \p;

insert into
    Theme (Libelle)
values
    ('Roman') \p;

insert into
    Theme (Libelle)
values
    ('Science-fiction') \p;

insert into
    Theme (Libelle)
values
    ('Thriller') \p;

insert into
    Theme (Libelle)
values
    ('Policier') \p;

insert into
    Auteur (Nom, Prenom, DateNaissance, Nationalite)
values
    ('Nothomb', 'Amélie', '1967-13-08', 'Belge') \p;

insert into
    Auteur (Nom, Prenom, DateNaissance, Nationalite)
values
    ('Hugo', 'Victor', '1802-26-02', 'Français') \p;

insert into
    Auteur (Nom, Prenom, DateNaissance, Nationalite)
values
    (
        'Christie',
        'Agatha',
        '1890-15-09',
        'Britannique'
    ) \p;

insert into
    Auteur (Nom, Prenom, DateNaissance, Nationalite)
values
('Chattam', 'Maxime', '1976-19-02', 'Français') \p;

insert into
    Auteur (Nom, Prenom, DateNaissance, Nationalite)
values
    ('Connelly', 'Michael', '1956-21-07', 'Américain') \p;

insert into
    Livre (
        Titre,
        Isbn,
        Langue,
        AnneePublication,
        NombrePage,
        NombreExemplaire,
        IdTheme        
    )
values
    (
        'Soif',
        22264438,
        'Française',
        2019,
        162,
        4,
        3
        
    )\p;

insert into
    Livre (
        Titre,
        Isbn,
        Langue,
        AnneePublication,
        NombrePage,
        NombreExemplaire,
        IdTheme
    )
values
    (
        'Les Comtemplations',
        22530149,
        'française',
        2002,
        608,
        7,
        5
    )\p;

insert into
    Livre (
        Titre,
        Isbn,
        Langue,
        AnneePublication,
        NombrePage,
        NombreExemplaire,
        IdTheme
    )
values
    (
        'The black echo',
        0115613,
        'Anglaise américaine',
        1992,
        362,
        11,
        5
    )\p;
Insert Into AuteurLivre(
    IdAuteur,
    IdLivre
)
values
(
1,
1
)\p;
Insert Into AuteurLivre(
    IdAuteur,
    IdLivre
)
values (
    5,
    3
);
Insert Into AuteurLivre(
    IdAuteur,
    IdLivre
)
values(
    3,
    2
);



    insert into Lecteur (Nom, Prenom, DateNaissance) values ('Baloge', 'Sébastien', '1982-23-08');
    insert into Lecteur (Nom, Prenom, DateNaissance) values ('Baloge', 'Aude', '1987-02-02');
    insert into Lecteur (Nom, Prenom, DateNaissance) values ('Baloge', 'Cédric', '1993-13-03');
    insert into Lecteur (Nom, Prenom, DateNaissance) values ('Caillault', 'Mylène', '1962-18-10');
    insert into Lecteur (
        
        Nom, Prenom, DateNaissance) values ('Guignard', 'Noélie', '2013-13-08');

insert into Emprunt (DateDebut,  IdLivre, IdLecteur) values ('2022-13-04',  3, 5);
insert into Emprunt (DateDebut, DateFin,  IdLivre, IdLecteur) values ('2014-12-02', '2014-20-02',  2, 3);
insert into Emprunt (DateDebut, DateFin,  IdLivre, IdLecteur) values ('2022-05-12', NULL, 1, 4);

Select IdAuteur, Nom, Titre
from Auteur
Inner Join AuteurLivre ON Auteur.Id = AuteurLivre.IdAuteur
Inner Join Livre ON AuteurLivre.IdLivre=Livre.Id;

/*
+----------+----------+--------------------+
| IdAuteur | Nom      | Titre              |
+----------+----------+--------------------+
|        1 | Nothomb  | Soif               |
|        3 | Christie | Les Comtemplations |
|         5 | Connelly | The black echo     |
+----------+----------+--------------------+
3 rows in set (0,003 sec)





*/