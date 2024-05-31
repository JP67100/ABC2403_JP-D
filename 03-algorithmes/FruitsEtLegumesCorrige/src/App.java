

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		/*L’utilisateur peut saisir des noms de légumes. 
		Pour chaque légume, l’utilisateur précise un prix au kilo.
		Exemple : “carottes 2.99”
		Lorsque l’utilisateur saisit la valeur “go”, le programme affiche la liste des légumes avec leur prix ainsi que le légume le moins cher.
		Exemple :
		1 kilogramme de carottes coute 2.99 euros.  1 kilogramme de poireaux coute 1.99 euros.
		[...]
		*///  Légume le moins cher au kilo : poireaux 
		
		Scanner sc = new Scanner(System.in);
		String saisieUtilisateur;
		String [] legumesPrix = new String[1] ;
		String []legumesPrix2 = new String []
		do {
			System.out.println("Saisissez un légume");
			saisieUtilisateur=sc.nextLine();
			
			if (!saisieUtilisateur.equals("go")) {
			
			legumesPrix[legumesPrix.length-1] = saisieUtilisateur;
			
			legumesPrix2 = new String [legumesPrix.length+1];
			
			System.arraycopy(legumesPrix, 0,legumesPrix2,0, legumesPrix2.length);
			
			legumesPrix= legumesPrix2;
			}
			
		while(!saisieUtilisateur.equals("go"));
		
		for (int = 0 ; i < legumesPrix.length ; i++) {
			System.out.println(legumesPrix[i]);
		}
			
		}
		//Parcourir un tableau à l'envers
		
		//for (int i = legumesPrix.length-1 ; i >= legumesPrix.length ; i--) {
	//	}
			
			
		
		
		
		
		
		
		
		
		sc.close();
	
	
	
	
	
	
	
	
	
	
	}

}
