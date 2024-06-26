
public class App {

	public static void main(String[] args) {
		String [] nom = { "ici" } ;
		
		if (estPalindrome (x)) 
			System.out.println(nom + "est un palindrome");
		else
			System.out.println( nom +"n'est pas un palindrome");
	}


	public static boolean estPalindrome (String x) {
	
	boolean resultat = true ; 
	int i = 0 ;
	int longueur = x.length () ;

	while (i<longueur/2 && resultat) {
	
		if (x.charAt(i) == x.charAt(longueur-1));
		resultat = true ;
		else 
		resultat = false ;
		i++;
	}
		return resultat ;
	}
		
		
	}
