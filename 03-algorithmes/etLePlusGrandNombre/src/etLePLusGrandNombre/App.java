package etLePLusGrandNombre;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int max = Integer.MIN_VALUE; // Initialiser le maximum à la valeur minimale possible pour un entier
	        int numero = 1; // Numéro du nombre saisi

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Entrez le nombre numéro " + numero + " : ");
	            int nombre = sc.nextInt();

	            if (nombre > max) {
	                max = nombre;
	            }
	            numero++;
	        }

	        System.out.println("Le plus grand des nombres saisis est : " + max);
	    }
	}

	}

}
