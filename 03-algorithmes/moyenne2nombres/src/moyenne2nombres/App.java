package moyenne2nombres;

import java.util.Scanner; // import du composant Scanner

public class App {

	public static void main(String[] args) {
		
	int nombre1;
	int nombre2;
	float moyenne;
	
	Scanner sc;
	
	sc = new Scanner (System.in); // Penser a initialiser (ligne3)
	
	System.out.println("Veuillez saisir un premier nombre: ");
	
	nombre1 = sc.nextInt();
	
	System.out.println ("Veuillez saisir un second nombre: ");
	
	nombre2 = sc.nextInt();
	
	moyenne = (nombre1 + nombre2) / 2F;
	
	System.out.println (" La moyenne de " + nombre1 + " et " + nombre2 + " est: " +  moyenne );
	
	
	sc.close(); // Toujours penser a ferme le Scanner
	
	
	}

}
