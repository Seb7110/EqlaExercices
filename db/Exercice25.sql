USE BlindCode;

SELECT Classe.Nom, COUNT(IdEleve) AS NbEleve
FROM Eleve 
INNER JOIN Classe ON Eleve.IdClasse =Classe.IdClasse
GROUP BY Classe.Nom
ORDER BY Classe.nom desc ;