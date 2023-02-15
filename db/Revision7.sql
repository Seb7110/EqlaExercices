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
 /*  SELECT
    nom,
    prenom,
    titre,
    date_emprunt,
    date_retour
FROM
    lecteur
    INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
    INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
WHERE
    lecteur_id = 1;  */

 /*  SELECT
   lecteur.nom, auteur.nom, auteur.prenom, 
    lecteur.prenom,
    titre,
    date_emprunt,
    date_retour
FROM
    lecteur
    INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
    INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
    INNER JOIN auteur
    ON auteur.id =livre.auteur_id
WHERE
    lecteur_id = 1;   */


 /*   SELECT titre, date_naissance
    FROM livre
    INNER JOIN auteur
    ON auteur.id =livre.auteur_id
    WHERE date_naissance< '1980-01-01'; */


 /*   SELECT livre.*
    FROM exemplaire
    INNER JOIN livre
    ON livre.id = exemplaire.livre_id ;  */


/*    SELECT * 
    FROM auteur
    WHERE nationalite =  'français'; */

/*   SELECT *
FROM auteur
WHERE nom LIKE 'M%'; */


/*  SELECT nom, LENGTH(nom) AS longueur
FROM auteur
WHERE LENGTH(nom)>5;  */

/* SELECT *
FROM auteur
WHERE nom LIKE '%e%' AND prenom LIKE '%e%'; */

/*  SELECT nom, prenom, (DATE_FORMAT(FROM_DAYS(TO_DAYS(NOW())-TO_DAYS(date_naissance)), '%Y')+0) as age  
FROM auteur; */

/*  SELECT nom, prenom, titre
FROM
    lecteur
    INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
    INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
WHERE date_retour IS NULL; */

/*   SELECT COUNT(titre) 
    FROM exemplaire
    INNER JOIN livre
    ON livre.id = exemplaire.livre_id 
WHERE titre = 'Charlie Chan''s Murder Cruise';  */

/*    SELECT *
    FROM emprunt
        INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
HAVING
COUNT(*) =2; */

/*    SELECT *
    FROM emprunt
        INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
    WHERE date_retour IS NULL;
HAVING
COUNT(*) ; */


/*  SELECT COUNT(*)
    FROM emprunt
        INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
WHERE date_retour IS NULL
HAVING theme = 'fantastique'; */

/*  SELECT COUNT(*)
    FROM emprunt
        INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
WHERE date_emprunt >= '2022-04-01' AND date_emprunt <= '2022-04-30'; */

/*  SELECT COUNT(*)
    FROM emprunt
        INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
WHERE  YEAR(2022)  AND MONTH(04)  ; */

/*   SELECT *
    FROM livre
    INNER JOIN auteur
    ON auteur.id =livre.auteur_id ; */


 /*  SELECT
   lecteur.nom, auteur.nom, auteur.prenom, 
    lecteur.prenom,
    titre,
    date_emprunt,
    date_retour
FROM
    lecteur
    INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
    INNER JOIN exemplaire ON exemplaire.id = emprunt.exemplaire_id
    INNER JOIN livre ON livre.id = exemplaire.livre_id
    INNER JOIN auteur
    ON auteur.id =livre.auteur_id
WHERE
    lecteur_id = 1;   */
