USE BlindCode;
SELECT Round(AVG(YEAR(CURDATE()) - YEAR(Naissance))) AS AgeMoyenSup, Floor(AVG(YEAR(CURDATE()) - YEAR(Naissance))) AS AgeMoyenInf  FROM Eleve;
