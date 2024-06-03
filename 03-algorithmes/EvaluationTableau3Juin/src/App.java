
public class App {

	public static void main(String[] args) {

		int[] tableau = { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };
		int somme = 0;
		float moyenne;
		int valeur = 42;

		for (int i = 0; i < tableau.length ; i++) {
			somme = somme + tableau[i];
		}

		moyenne = (float) somme / 10;

		System.out.println("La moyenne est de :" + moyenne);

		valeur = 42 * 42;

		System.out.println("La somme la plus élévé (42) au carré =" + valeur);
	}

}
