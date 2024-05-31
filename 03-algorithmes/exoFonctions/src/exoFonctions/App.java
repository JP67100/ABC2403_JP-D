package exoFonctions;

public class App {

	public static void main(String[] args) {
		//ECRIRE UNE PROCEDURE QUI CALCULE ET AFFICHE LE PERIMETRE D'UN TRIANGLE
		int a = 20;
		int b = 30;
		int c = 40;
		
		App.calculerPerimetreTriangle(a, b, c);
		
		int [] valeurs = new int[] {1, 3, 5, 7, 3, 4, 2, 4, 22};
		App.calculerMoyenne(valeurs);
	}
		public static void calculerPerimetreTriangle(int a,int b, int c) {
		
		int perimetre = a + b + c ;
		
		{ 
		System.out.println( "Le perimetre ="+ perimetre );}
	}
		public static void calculerMoyenne(int[]tableau ) {
			
			int somme=0 ;
			float moyenne;
			
			for (int i =0; i<tableau.length;i++) {
				somme += tableau[i];
				// somme = somme + tableau[i]
			}
			moyenne = (float) somme/(float)tableau.length;
			
			System.out.println("la moyenne est de :"+ moyenne);
		
		
		
		
		
		}

}

