package maRetraite;

public class App {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge (en années): ");
        int age = scanner.nextInt();

        final int retirementAge = 60;

        if (age < 0) {
            System.out.println("La valeur fournie n'est pas un âge valide.");
        } else if (age >= retirementAge) {
            int yearsRetired = age - retirementAge;
            System.out.println("Vous êtes à la retraite depuis " + yearsRetired + " années.");
        } else {
            int yearsUntilRetirement = retirementAge - age;
            System.out.println("Il vous reste " + yearsUntilRetirement + " années avant la retraite.");

            if (age == retirementAge - 1) {
                System.out.println("C'est le moment de prendre sa retraite!");
            }
        }
    }
}
	}

}
