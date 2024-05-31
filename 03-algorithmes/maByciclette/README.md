VARIABLES 

beauTemps est un booleen
veloOk est un booleen
livrePossedee estun booleen
reparationsImmediates est un booleen 
livreDispoBibliotheques est un booleen

TRAITEMENTS

SI beauTemps = VRAI ALORS 
       Si veloOk = VRAI
            ALORS ECRIRE "J'irai faire une balade à vélo. "

    SINON
        ECRIRE "Je vais chez le garagiste"
        
        SI reparationsImmediates = Vrai ALORS
            "J'irai faire une balade à vélo. "
        SINON reparationsImmediates = FAUX 
            ECRIRE "J'irai cueillir des joncs."
            FIN SI 
    FIN SI

SINON 
    ECRIRE " je vais lire un livre "
        Si livrePossedee = VRAI ALORS
            ECRIRE "Lecture comfortable dans un fauteuil" 
        SINON 
            ECRIRE "Je vais à la bibliotheque"
            
            SI livresDispoBibliotheques = VRAI ALORS 
                ECRIRE "j'emprunte un livre" 
            SINON
                ECRIRE "J'emprunte un roman policier" 
            
            FIN SI 
              ECRIRE "je rentre chez moi "

              SINON 
                    ECRIRE "Je lis GOT"
            
        FIN SI 

            ECRIRE "Lecture de mon livre dans le fauteuil"
    
    FIN SI
           
                




    



        






