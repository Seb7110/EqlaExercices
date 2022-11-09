use Localites;
SELECT Commune, CP INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' FROM Localite where CP=4280;