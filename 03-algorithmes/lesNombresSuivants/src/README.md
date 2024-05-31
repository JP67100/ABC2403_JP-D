// Demander un nombre de départ à l'utilisateur
Variable nombreDepart
Lire nombreDepart

// Initialiser un compteur pour les nombres suivants
Variable compteur = 1

// Boucle `tant que` pour afficher les 10 nombres suivants
Tant que compteur <= 10
    // Afficher le nombre actuel
    Afficher nombreDepart + compteur

    // Incrémenter le compteur
    compteur = compteur + 1
Fin de la boucle

// Message de fin
Afficher "Les 10 nombres suivants ont été affichés."