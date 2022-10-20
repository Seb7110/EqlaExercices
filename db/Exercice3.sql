use BlindCode
select Nom, Prenom, Email from eleve INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv';
select Nom from classe INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resultclasse.csv';
