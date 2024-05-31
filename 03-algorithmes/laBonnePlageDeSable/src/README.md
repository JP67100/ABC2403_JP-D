// Définir la plage de valeurs autorisées
nombre_min = 1
nombre_max = 3

// Initialiser la variable "nombre_saisi" à une valeur en dehors de la plage
nombre_saisi = -1

// Boucle "tant que" pour vérifier la saisie
tant que nombre_saisi < nombre_min ou nombre_saisi > nombre_max
    // Afficher une invite demandant à l'utilisateur de saisir un nombre
    AFFICHER "Entrez un nombre entre " & nombre_min & " et " & nombre_max & " : "

    // Lire l'entrée de l'utilisateur et la stocker dans la variable "nombre_saisi"
    nombre_saisi = LIRE_NOMBRE()

    // Vérifier si la saisie est dans la plage autorisée
    si nombre_saisi < nombre_min ou nombre_saisi > nombre_max
        // Afficher un message d'erreur
        AFFICHER "Saisie incorrecte. Veuillez réessayer."
    fin si
fin tant que

// Affichage du message de réussite
AFFICHER "Bravo, vous avez réussi ! Vous avez saisi le nombre " & nombre_saisi