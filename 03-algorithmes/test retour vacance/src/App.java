import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Déclaration du scanner pour la saisie utilisateur
        Scanner sc = new Scanner(System.in);

        // Demande de saisie d'un nombre à l'utilisateur
        System.out.print("Saisissez un nombre : ");

        // Saisie du nombre dans la variable 'nombre'
        int nombre = sc.nextInt();

        // Détermination du signe du nombre
        if (nombre > 0) {
            System.out.println(nombre + " est un nombre positif.");
        } else if (nombre == 0) {
            System.out.println(nombre + " est considéré comme un nombre positif.");
        } else {
            System.out.println(nombre + " est un nombre négatif.");
        }

        // Fermeture du scanner (libération des ressources)
        sc.close();
    }
}

	

