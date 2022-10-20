use Blindcode
select * INTO OUTFILE '/Users/sebastienbaloge/mesdepots/EqlaExercices/db/resulteleve.csv' from eleve where sexe='m' AND CP=7110;