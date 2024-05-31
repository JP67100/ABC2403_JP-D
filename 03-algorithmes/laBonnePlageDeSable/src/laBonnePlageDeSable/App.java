package laBonnePlageDeSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombreMin=1;
		int nombreMax=3;
		int nombreSaisi;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("entrez un nombre entre "+ nombreMin + "et" + nombreMax + ":" );
			
			nombreSaisi = scanner.nextInt();
				}
		while (nombreSaisi<nombreMin || nombreSaisi > nombreMax );
		
		System.out.println ("Bravo, vous avez réussi ! Vous avez saisi le nombre " + nombreSaisi );
		
		scanner.close ();
		
		}
		
	}

	
	
	

