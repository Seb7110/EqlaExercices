USE BlindCode2;
SELECT eleve.Nom, Prenom, classe.nom, DateInscription FROM eleve INNER JOIN classe ON eleve.classe = classe.IdClasse INNER JOIN EleveClasse ON Eleve.EleveClasse=EleveClasse.IdClasse;