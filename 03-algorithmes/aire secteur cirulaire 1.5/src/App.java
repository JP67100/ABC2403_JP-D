
	
import java.lang.Math;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double rayon;
		double angle;
		double aire;
		
		Scanner sc;
		
		sc = new Scanner (System.in);
				
		System.out.println("Veuillez saisir le rayon du cercle:");
		
		rayon = sc.nextInt();
		
		System.out.println ("Veuillez saisir l'angle :");
		
		angle = sc.nextInt();
		
		aire = ( Math.PI * Math.pow(rayon, 2) * angle / 360);
		
		System.out.println (" L'aire du secteur circulaire est de : " + aire );
		
		
		sc.close();
		
	} 
	
}
	
		

