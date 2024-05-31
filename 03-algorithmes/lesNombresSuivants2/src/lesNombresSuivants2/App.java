package lesNombresSuivants2;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int nombreDepart;
		
		
		System.out.println("Saisissez un nombre : ");
		nombreDepart = scanner.nextInt();
		
		int i = 1;
		
		while (i<=10) {
		System.out.println(nombreDepart+i+ ",");
		i++;
		}
	
		scanner.close();
	
	}

}
