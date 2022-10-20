use BlindCode
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' from eleve where Cp='7060';
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve1.csv' from eleve where Sexe='m';
select nom, prenom, localite INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve2.csv' from eleve where CP=7060;