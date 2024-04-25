import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
			System.out.println("Premier Exercice");
			
			int premierNombre;
			int secondNombre;
			float laMoyenne;
			Scanner sc;
			
			sc = new Scanner(System.in);
			
			System.out.println("Saisir le premier nombre: " );
			
			premierNombre = sc.nextInt();
			
			System.out.println("Saisir le second nombre " );
			
			secondNombre = sc.nextInt();
			
			laMoyenne = (premierNombre + secondNombre) / 2;
			
			System.out.println("La moyenne de "+ premierNombre + "et" + secondNombre + " est: " + laMoyenne);
			
			sc.close();
	}

}
