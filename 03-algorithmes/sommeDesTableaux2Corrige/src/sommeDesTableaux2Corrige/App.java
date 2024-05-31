package sommeDesTableaux2Corrige;

public class App {

	public static void main(String[] args) {
//à partir de deux tableaux d’entiers précédemment saisis, écrivez un algorithme qui calcule la somme des produits des deux tableaux.
//	Pour calculer le résultat, il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2, et additionner le tout.
		int[] tableau1;
		int[] tableau2;
		int resultatTableau=0;
		
		tableau1= new int[] {4, 8, 7, 12};
		tableau2= new int[] {3, 6};
		
		for (int i = 0; i<tableau1.length; i++) {
			
			for (int j = 0; i<tableau2.length; j++) {
			resultatTableau += tableau1[i]* tableau2[j];
			}
			
			System.out.println(resultatTableau);
	}}

}
