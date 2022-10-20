use BlindCode
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' from eleve where Tel IS NULL;
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve1.csv' from eleve where Tel IS NOT NULL;