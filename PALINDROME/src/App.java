
public class App {

	public static void main(String[] args) {
		String nom = "laval" ;
	
		
		if (estPalindrome (nom)) 
			System.out.println(nom + " est un palindrome");
		else
			System.out.println( nom +" n'est pas un palindrome");
	}

	public static boolean estPalindrome(String mot) {

		boolean resultat = true;
		int i = 0;
		int longueur = mot.length();

		while (i < longueur / 2 && resultat) {
			if (mot.charAt(i) == mot.charAt(longueur - 1 - i)) {
				resultat = true;
			} else {
				resultat = false;
			}
			i++;
		}
		return resultat;
	}

}
