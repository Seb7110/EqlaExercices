--  USE Ventes;
--  SELECT MAX(Prix) FROM Produit;

--  USE Ventes;
--  SELECT MIN(Prix) FROM Produit;

--  USE Ventes;
--  SELECT SUM(Prix) FROM Produit;

SELECT * FROM Produit WHERE Prix=(SELECT Max(Prix) FROM Produit);