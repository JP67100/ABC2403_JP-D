package positifounegatif;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
         Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre entier: ");
          int nombre = sc.nextInt();

        // Déterminer si le nombre est positif ou négatif
          if (nombre > 0) {
            System.out.println(nombre + " est un nombre positif.");
        } else if (nombre == 0) {
            System.out.println(nombre + " est considéré comme un nombre positif.");
        } else {
            System.out.println(nombre + " est un nombre négatif.");
        
        
        sc.close();}
    }



	}

