use BlindCode
SELECT * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' FROM Eleve WHERE Email NOT LIKE '%gmail.com';