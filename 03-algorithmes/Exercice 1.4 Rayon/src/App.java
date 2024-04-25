import java.util.Scanner;

import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		double rayon;
		double aire;
		double volume;
		
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println(" Saisir la Taille rayon d'un cercle: ");
	
		rayon = sc.nextDouble();
		
		aire  = ( 4 * Math.PI * Math.pow(rayon, 2)  );
				
		volume = ( 4 * Math.PI * Math.pow(rayon, 3 )/3 );
			
		System.out.println( "L'aire de la sphère est : " + aire );
				
		System.out.println ( "Le volume de la sphère est : "  + volume) ;
		
		sc.close();
		
		}
}