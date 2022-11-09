USE Ventes;
SELECT Categorie, SUM(Stock) FROM Produit GROUP BY Categorie;