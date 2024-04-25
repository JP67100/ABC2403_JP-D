2.. La lumiere d'un vehicule s'eclaire si une des deux portes avant est ouverte (capteurs pd et pg a coupure de circuit) ou si l'interrupteur du plafonnier est appuye.

Presentez:
•	Les propositions
•	La table de verite
•	L'expression booleenne simplifiee

Lumiere allume si :
Porte droite ouverte porte gauche fermee interrupteur non appuye
Porte gauche ouverte porte droite fermee interrupteur non appuye
Porte droite et gauche fermee et interrupteur appuye
Porte droite ouverte porte gauche fermee interrupteur appuye
Porte gauche ouverte porte droite fermee interrupteur appuye
Porte gauche et droite ouverte et interrupteur appuye
Porte gauche et droite ouverte et interrupteur non appuye

Table de verite :

Porte droite (P1)
Porte gauche (P2)
Interrupteur (P3)
Lumiere allume (P4)

    P1  /   P2  /   P3    =     1 (P4 allume) 
    1       0       0     =     1
    0   /   1   /   0     =     1
    0   /   0   /   1     =     1
    1   /   1   /   0     =     1
    1   /   1   /   1     =     1
    1   /   1   /   0     =     1
    1   /   1   /   1     =     1

    P4= (P1 + P2) .+ P3
    P4 est alumme si P1 ou P2 sont ouverte(s) ou si P3 est appuye
