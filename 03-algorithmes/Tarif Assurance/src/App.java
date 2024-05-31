import java.util.Scanner;

	public static void main(String[] args) {
		
	int tarifVert;
	int tarifOrange;
	int tarifBleu;
	int tarifRouge;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Entrez l'âge du conducteur: ");
    int age = scanner.nextInt();
    
    System.out.print("Entrez l'ancienneté du permis en années: ");
    int anciennetéPermis = scanner.nextInt();
    
    System.out.print("Entrez le nombre d'accidents responsables: ");
    int nombreAccident = scanner.nextInt();
    
    System.out.print("Entrez si assuré depuis plus de 5 ans (true/false): ");
    boolean fidélité = scanner.nextBoolean();
    
    String tarif;

    if 
    	(age<25 && anciennetéPermis<2 && nombreAccident<1) 
    	{tarif = "Rouge";
    }
    else if (nombreAccident >0);{
		tarif = "Refusé";
	}
	if (age < 25 && anciennetéPermis >= 2 || age >= 25 && anciennetéPermis < 2)
	{tarif = "Orange";
	}
	else if (nombreAccident == 1) {
	tarif = "Rouge";
	}
	else {
    tarif = "Refusé";
     }
	 if  (nombreAccident == 0) {
             tarif = "Vert";
         } else if (nombreAccident == 1) {
             tarif = "Orange";
         } else if (nombreAccident == 2) {
             tarif = "Rouge";
         } else {
             tarif = "Refusé";
         }
         System.out.println("Le tarif d'assurance est: " + tarif);

}


