package triDeNombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Entrez le premier nombre: ");
	int a = scanner.nextInt();
	
	System.out.print("Entrez le deuxième nombre: ");
	int b = scanner.nextInt();
	
	 int min = Math.min(a, b);
     int max = Math.max(a, b);

     System.out.println("Ordre croissant: " + min + " " + max);

	}

}
