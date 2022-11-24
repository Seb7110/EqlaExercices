CREATe DATABASE Exercice27;
USE Exercice27;

CREATE TABLE Equipe(
    IdEquipe Int Unsigned NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NomClub VARCHAR(30) NOT NULL,
    Localite VARCHAR(30) NOT NULL,
    Division TINYINT Unsigned NOT NULL);
CREATE TABLE Joueur (
    IdJoueur Int Unsigned NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(30) NOT NULL,
    Prenom VARCHAR(30) NOT NULL,
    DateNaissance DATE NoT NULL,
IdEquipe Int Unsigned NOT NULL,
 FOREIGN KEY(IdEquipe) REFERENCES Equipe(IdEquipe));