package macategoriefootball;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        String categorie;

        if (age < 5) {
            categorie = "Trop jeune";
        } else if (age <= 6) {
            categorie = "Débutant";
        } else if (age <= 8) {
            categorie = "Poussin";
        } else if (age <= 10) {
            categorie = "Benjamin";
        } else if (age <= 12) {
            categorie = "Pupille";
        } else if (age <= 14) {
            categorie = "Minime";
        } else if (age <= 16) {
            categorie = "Cadet";
        } else if (age <= 18) {
            categorie = "Junior";
        } else if (age <= 34) {
            categorie = "Sénior";
        } else {
            categorie = "Vétéran";
        }

        System.out.println("Votre catégorie est : " + categorie);
        
        scanner.close();
        
    }

	}


