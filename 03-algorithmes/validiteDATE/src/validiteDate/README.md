//VARIABLES 

jour est un entier 
mois est un entier 
annee est un entier 
bissextile est un booleen
dateValide est un booléen 

// TRAITEMENTS

LIRE jour
LIRE mois 
LIRE annee
LIRE bissextile

// CONDITIONS

SI (jour < 1 || jour > 31) 
dateValide = FAUX


SINON SI (mois == 2 && jour > 28)

SI (!estBissextile(annee) && jour > 28) 
dateValide = FAUX

//VERIFICATIONS ANNEE BISEXTILE

SI (annee % 4 != 0) = FAUX
SINON SI (annee % 100 == 0 && annee % 400 != 0) = FAUX
SINON = VRAI

RESULTATS 

SI (dateValide) 
 ECRIRE("La date est valide.");
SINON 
ECRIRE("La date est invalide.");







        