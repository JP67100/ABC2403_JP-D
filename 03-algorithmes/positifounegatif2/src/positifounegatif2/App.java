package positifounegatif2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le premier nombre
        System.out.print("Entrez le premier nombre entier: ");
        int nombre1 = sc.nextInt();

        // Demander à l'utilisateur de saisir le deuxième nombre
        System.out.print("Entrez le deuxième nombre entier: ");
        int nombre2 = sc.nextInt();

        // Calculer le produit des deux nombres
        int produit = nombre1 * nombre2;

        // Déterminer le signe du produit
        if (produit > 0) {
            System.out.println("Le produit " + nombre1 + " * " + nombre2 + " est positif.");
        } else if (produit == 0) {
            System.out.println("Le produit " + nombre1 + " * " + nombre2 + " est égal à zéro.");
        } else {
            System.out.println("Le produit " + nombre1 + " * " + nombre2 + " est négatif.");
       
            sc.close(); }
    }


	}

