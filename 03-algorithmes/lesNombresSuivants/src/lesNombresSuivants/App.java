package lesNombresSuivants;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int variableCompteur ;
		
		do {
			System.out.println("Saisissez un nombre entre 10 et 20");
			variableCompteur = scanner.nextInt();
			
			if (variableCompteur>20) {
				System.out.println("Plus petit !");
			}
			else if (variableCompteur<10) {
				System.out.println("Plus Grand !");
			}
		}
		while (variableCompteur < 10 || variableCompteur > 20);
			
		System.out.println("Yes, you did it ! ");
		
	    scanner.close();
	 
		
		
		
		}
		

	}


