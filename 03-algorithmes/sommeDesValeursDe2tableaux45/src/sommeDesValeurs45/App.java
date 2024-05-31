package sommeDesValeurs45;

public class App {

	public static void main(String[] args) {

		int[] tableau = new int[8];

		int[] tableau2 = new int[8];

		int[] tableau3 = new int[8];

		tableau[0] = 4;
		tableau[1] = 8;
		tableau[2] = 7;
		tableau[3] = 9;
		tableau[4] = 1;
		tableau[5] = 5;
		tableau[6] = 4;
		tableau[7] = 6;

		tableau2[0] = 7;
		tableau2[1] = 6;
		tableau2[2] = 5;
		tableau2[3] = 2;
		tableau2[4] = 1;
		tableau2[5] = 3;
		tableau2[6] = 7;
		tableau2[7] = 4;

		for (int i = 0; i < tableau.length; i++) {

				tableau3[i] = tableau[i] + tableau2[i];
				}
				
		System.out.print("La somme des valeurs des 2 tableaux précédents sont : " );
		for (int i = 0; i < tableau.length; i++)
				{
		System.out.print(tableau3[i] + " " );
				}

		

	}
}
