use BlindCode
SELECT * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' FROM eleve WHERE Naissance BETWEEN '1980/01/01' AND '1989/12/31';