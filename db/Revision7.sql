USE biblio4_prof;

 /*  SELECT
     titre,
    theme
FROM
    livre
    INNER JOIN theme ON livre.theme_id = theme.id; */

 /*   SELECT COUNT(*) AS nbr_exemplaire
    FROM emprunt
    WHERE date_retour IS NULL; */ 


 /*   SELECT nom, prenom, COUNT(*) AS nbr_exemplaire 
     FROM lecteur 
     INNER JOIN emprunt ON lecteur.id =emprunt.lecteur_id
     GROUP BY lecteur.id
     ORDER BY nbr_exemplaire DESC
     LIMIt 1; */


 /*    SELECT titre, COUNT(*) AS nb_emprunt
FROM livre
INNER JOIN exemplaire
ON livre.id =exemplaire.livre_id
INNER JOIN emprunt
ON exemplaire.id =emprunt.exemplaire_id
GROUP BY livre_id
ORDER By nb_emprunt DESC
limit 1; */

SELECT nom, prenom, titre, date_emprunt, date_retour 
FROM lecteur 
INNER JOIN emprunt
ON lecteur.id = emprunt.lecteur_id
INNER JOIN exemplaire 
ON emprunt.id=exemplaire.emprunt_id
ON exemplaire.id=emprunt.exemplaire_id
WHERE lecteur_id=1;