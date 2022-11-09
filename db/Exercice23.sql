USE Pays;
SELECT fullname AS Pays, Continent.name AS Continent FROM Pays INNER JOIN Continent ON Pays.continent = continent.code;