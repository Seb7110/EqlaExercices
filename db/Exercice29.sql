USE Exercice27;
INSERT INTo Joueur(Nom, Prenom, DateNaissance, IdEquipe)
VALUES ('Baloge', 'Sébastien', '1982-08-23', 1);
INSERT INTo Joueur(Nom, Prenom, DateNaissance, IdEquipe)
 VALUES('Colin', 'Pierre', '1984-07-24', 2);
 INSERT INTo Joueur(Nom, Prenom , DateNaissance, IdEquipe)
 VALUES('Jacques', 'Gabriel', '2014-08-22', 1);
 INSERT INTo Joueur(Nom, Prenom, DateNaissance, IdEquipe)
 VALUES('Dupont', 'Philip', '1991-11-13', 1);
 SELECT Joueur.*, NomClub from Joueur INNeR JoIN Equipe ON Joueur.IdEquipe=Equipe.IdEquipe;