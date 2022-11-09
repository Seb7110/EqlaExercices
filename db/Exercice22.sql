--  USE Pays;
--  SELECT Pays.name AS Pays, Continent.name AS Continent FROM Pays INNER JOIN Continent ON Pays.continent = continent.code;

USE Pays;
SELECT Pays.name AS Pays, Continent.name AS Continent FROM Pays INNER JOIN Continent ON Pays.continent = continent.code ORDER BY Pays.name ASC;