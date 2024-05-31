package demoFonction;

public class App {
// EXERCICE 4.4
	public static void main(String[] args) {
		int i ;// utilisee pour la boucle for
		float somme;//somme des valeurs du tableau 
		float[] tableau;//Le tableau
		
		tableau = new float[];
		{
		13.37f,
		14.5f,
		9.4f,
		987.456f,
		1.01f,
		3.45f,
		0.02f,
		7.45f,
		42f,
		99,99f,
		};
		
		somme = 0;
		for (i=0;i<tableau.length;i++);
		
		somme += tableau [i];
		System.out.println("La somme est de"+ somme);

}
