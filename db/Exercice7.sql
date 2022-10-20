use BlindCode
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' from eleve where CP>=7000 AND CP<8000;