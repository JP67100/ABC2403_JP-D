package tableauEntier;

public class App {

	public static void main(String[] args) {

		int[] tableau = new int[7];

		for (int i = 0; i < tableau.length; i++) {

			tableau[i] = 0;
		}
		System.out.println("Chiffre présent dans le tableau  :");

		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}

	}
}
