--  USE BlindCode;
--  SELECT Nom, Prenom, Naissance, YEAR(CURDATE()) - YEAR(Naissance) AS Age FROM Eleve;

--  USE BlindCode;
--  SELECT Nom, Prenom, Naissance, YEAR(CURDATE()) - YEAR(Naissance) AS Age FROM Eleve ORDER BY Age ASC;
USE BlindCode;
--SELECT Nom, Prenom, Naissance, YEAR(CURDATE()) - YEAR(Naissance) AS Age FROM Eleve ORDER BY Age DESC;
SELECT DISTINCT YEAR(CURDATE()) - YEAR(Naissance) AS Age FROM Eleve ORDER BY Age DESC;
