VARIABLES

scoreCandidat1 est un entier
scoreCandidat2 est un entier
scoreCandidat3 est un entier
scoreCandidat4 est un entier

2. Calcul du nombre total de votes

TotalVotes = ScoreCandidat1 + ScoreCandidat2 + ScoreCandidat3 + ScoreCandidat4

3. Détermination du seuil de majorité absolue

SeuilMajoriteAbsolue = TotalVotes / 2
4. Analyse du résultat pour le candidat 1

Si ScoreCandidat1 > SeuilMajoriteAbsolue
Afficher "Le candidat 1 est élu dès le premier tour."
Sinon
ScoreSeuilSecondTour = TotalVotes * 12.5 / 100
Si ScoreCandidat1 >= ScoreSeuilSecondTour
Si ScoreCandidat1 > ScoreCandidat2 && ScoreCandidat1 > ScoreCandidat3 && ScoreCandidat1 > ScoreCandidat4
Afficher "Le candidat 1 est en ballottage favorable."
Sinon
Afficher "Le candidat 1 est en ballottage défavorable."
Sinon
Afficher "Le candidat 1 est battu."
Fin

