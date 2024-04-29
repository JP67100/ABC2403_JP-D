package inversion2valeurs;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Déclaration des variables
        int a;
        int b;

        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner sc = new Scanner(System.in);

        // Lire la valeur de A
        System.out.print("Entrez la valeur de A: ");
        a = sc.nextInt();

        // Lire la valeur de B
        System.out.print("Entrez la valeur de B: ");
        b = sc.nextInt();

        // Afficher la valeur de A
        System.out.println("Valeur de A: " + a);

        // Afficher la valeur de B
        System.out.println("Valeur de B: " + b);

        // Permuter les valeurs de A et B
        int temp = a;
        a = b;
        b = temp;

        // Afficher la valeur de A après permutation
        System.out.println("\nValeur de A après permutation: " + a);

        // Afficher la valeur de B après permutation
        System.out.println("Valeur de B après permutation: " + b);
        
        sc.close();
    
    }
    
}
         

