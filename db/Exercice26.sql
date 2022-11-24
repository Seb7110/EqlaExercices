CREATE DATABASE Exercice26;
USE Exercice26;
CREATE TABLE Equipe(
    IdEquiepe Int Unsigned NOT NULL AUTO_INCREMENT,
    NomClub VARCHAR(30) NOT NULL,
    Localite VARCHAR(30) NOT NULL,
    Division TINYINT Unsigned NOT NULL);