package laBonnePlageDeSableTestSolo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		  Scanner scanner = new Scanner(System.in);

	        int nombreSaisi;

	        do {
	            System.out.print("Entrez un nombre entre 1 et 3: ");
	            nombreSaisi = scanner.nextInt();
	        } while (nombreSaisi < 1 || nombreSaisi > 3);

	        System.out.println("Bravo, vous avez réussi ! Vous avez entré le nombre " + nombreSaisi);
	}

}
