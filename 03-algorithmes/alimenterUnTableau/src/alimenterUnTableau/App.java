package alimenterUnTableau;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
//Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées dans un tableau.
//L’utilisateur doit donc commencer par entrer le nombre de valeurs 
//qu’il compte saisir.
//Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée, 
//le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives.
		Scanner sc = new Scanner(System.in);
		int tailleTableau;
		int compteur;
		int positif= 0;
		int negatif= 0;
		int[] tableau;
		int i;
		
		System.out.println("Entrez le nombre de valeurs que vous souhaitez saisir :");
		tailleTableau = sc.nextInt();
		
		tableau = new int[tailleTableau];
		
		for (i=0; i<tailleTableau; i++);{
		System.out.println("Saisissez la valeur n°"+ (i+1) + "/" + tailleTableau);
		
		tableau[i]= sc.nextInt();
		 
			if (tableau[i] >=0) {
				positif++;
				}
	
			else {
					negatif++;
					}
		}
				
			System.out.println("Vous avez saisi : "+ positif +"nombres negatifs");
			System.out.println("Vous avez saisi : "+ negatif + "nombres negatifs");
			
			sc.close();
	}
}
