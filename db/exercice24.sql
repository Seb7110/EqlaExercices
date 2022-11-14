USE BlindCode2;

SELECT
    Eleve.nom,
    Classe.nom,
    DateInscription
FROM
    Eleve
    INNER JOIN EleveClasse ON Eleve.IdEleve = EleveClasse.IdEleve
    INNER JOIN Classe ON EleveClasse.IdClasse = Classe.IdClasse;

/ / deuxième version avec l 'utilisation d' un "AS":
SELECT
    e.nom,
    c.nom,
    DateInscription
FROM
    Eleve AS e
    INNER JOIN EleveClasse AS ec ON e.IdEleve = ec.IdEleve
    INNER JOIN Classe AS c ON ec.IdClasse = c.IdClasse;