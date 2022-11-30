/* USE Pays;
 SELECT name AS Nom
 FROM Pays
 WHERE name LIKE 'u%'; */
/*  USE Pays;
 SELECT name AS Nom
 FROM Pays
 ORDER BY name DESC; */
/*  USE Pays;
 SELECT name AS Nom
 FROM Pays
 ORDER BY name ASC; */
/*  USE Pays;
 SELECT name AS Nom
 FROM Pays
 WHERE name LIKE '%ca';  */
/*   USE Pays;
 SELECT COUNT(name) AS Nom
 FROM Pays
 WHERE name LIKE '%ca'; */
/* USE Pays;
 SELECT name AS Nom
 FROM Pays
 WHERE name LIKE 'e%' AND name LIKE '%a' AND name LIKE '%t%'; */

/*  USE Pays;
 SELECT name AS Nom
 FROM Pays
 WHERE name LIKE 'e%%t%%a'; */


/*  USE Pays;
SELECT COUNT(*)
FROM Pays; */

USE Pays;
/*  SELECT name AS nom
FROM Pays
WHERE Id_Pays BETWEEN 20 AND 43; */


/*  uSE Pays;
SELECT name AS nom 
FROM Pays 
WHERE Id_Pays>20 AND Id_Pays<43; */

/*  USE Pays;
SELECT name AS Nom 
FROM Pays
WHERE Id_Pays<48 OR Id_Pays>125; */

USE Pays;
SELECT name AS Nom 
FROM Pays 
WHERE code IN ('Be', 'Fr', 'Lu', 'Nl');