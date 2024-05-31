package laSuiteDeFibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int position = 2;
		int n;
		String resultat = "0 1";
		int NbPrecedent = 0;
		int NbCourant = 1;
		int NbSuivant;
		
		System.out.println("Suite de fibonacci. Combien de nombre de la suite souhaitez-vous afficher,");
		n = sc.nextInt();
		
		if (n>2) {
			while(position < n) {
				NbSuivant = NbPrecedent+NbCourant;
				resultat = resultat + "" + NbSuivant;
				NbPrecedent = NbCourant;
				NbCourant = NbSuivant;
				position++;
			}
		}
			
		else {
			n=2;
		}
		 	 
		 
		
		System.out.printf("Les",n,"premier nombres de les suite de Fibonacci sont /n," + resultat);

		sc.close();
	}
}

