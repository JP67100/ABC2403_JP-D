VARIABLES

tarifVert est un entier 
taifOrange est un entier 
tarifBleu est un entier
tarifRouge est un entier 
age: Âge du conducteur, est un entier
anciennetéPermis: Ancienneté du permis en années, est un entier
nombreAccidents: Nombre d'accidents responsables, est un entier
fidélité: True si assuré depuis plus de 5 ans, False sinon, est un booleen

TRAITEMENTS 

Lire age 
Lire anciennetéPermis
Lire nombreAccidents 
Lire fidélité

Si age < 25 et anciennetéPermis <2 et nombreAccident <1 = tarif rouge
Si nombreAccidents >0 alors 
Sinon:tarif = "refusé"
Si age < 25 et anciennetéPermis >= 2 ou age >= 25 et anciennetéPermis < 2:
Si nombreAccidents == 0:tarif = "orange"
Si nombreAccidents == 1:tarif = "rouge"
Sinon:tarif = "refusé"
Sinon:
Si nombreAccidents == 0:tarif = "vert"
Si nombreAccidents == 1:tarif = "orange"
Si nombreAccidents == 2:tarif = "rouge"
Sinon:tarif = "refusé"