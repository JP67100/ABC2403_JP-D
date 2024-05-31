package triDeNombre2;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Entrez un nombre ");
	int a = scanner.nextInt();

	System.out.println("Entrez un deuxième nombre:");
	int b = scanner.nextInt();
	
	System.out.println("Entrez un troisième nombre:");
	int c = scanner.nextInt();
	
	 if (a >= b && a >= c) {
         // a est le plus grand
	 }
	 	if (b >= c) {
             // b est le milieu, c est le plus petit
             System.out.println("Ordre décroissant: " + a + " " + b + " " + c);
         } else {
             // c est le milieu, b est le plus petit
             System.out.println("Ordre décroissant: " + a + " " + c + " " + b);
         }
      else if (b>= a && b >= c) {}
         // b est le plus grand
         if (a >= c) {
             // a est le milieu, c est le plus petit
             System.out.println("Ordre décroissant: " + b + " " + a + " " + c);
         } else {
             // c est le milieu, a est le plus petit
             System.out.println("Ordre décroissant: " + b + " " + c + " " + a);
         }
      else {
         // c est le plus grand
         if (a >= b) {
             // a est le milieu, b est le plus petit
             System.out.println("Ordre décroissant: " + c + " " + a + " " + b);
         } else {
             // b est le milieu, a est le plus petit
             System.out.println("Ordre décroissant: " + c + " " + b + " " + a);
             }
	
	}
	}
	 
}

