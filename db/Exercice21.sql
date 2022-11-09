USE BlindCode2;
SELECT YEAR(DateInscription) As 'Annee Inscription', COUNT(DateInscription)
FROM EleveClasse
group by YEAR(DateInscription);