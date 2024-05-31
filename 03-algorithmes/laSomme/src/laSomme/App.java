package laSomme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Saisissez un nombre entier: ");
		        int nombre = scanner.nextInt();

		        int somme = 0;
		        for (int i = 1; i <= nombre; i++) {
		            somme += i;
		        }

		        System.out.println("La somme des nombres jusqu'à " + nombre + " est: " + somme);
		    }
		
		
	}


