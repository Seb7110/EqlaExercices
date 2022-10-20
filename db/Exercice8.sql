use BlindCode
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' from eleve where Naissance>='1980/01/01';
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve1.csv' from eleve where Naissance<'1980/01/01';