package estTuMajeur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Entrez votre âge (en années): ");
	int a = scanner.nextInt();
	
	if (a>=18) {
		System.out.println("Vous êtes majeur");}
	else if(a>0){
		System.out.println(" Vous êtes mineur");}
	else { 
		System.out.println("Vous n'êtes pas encore née");
	}
	
	scanner.close();
		
	}

}
