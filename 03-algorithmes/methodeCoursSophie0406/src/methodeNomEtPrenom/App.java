package methodeNomEtPrenom;
import java.text.SimpleDateFormat;
import java.util.Date;
public class App{

	public static void main(String[]args) {
	
	String prenom = "Mickaël.";
	String nom = "Devoldere";
	String resultat= App.prenomNom(prenom, nom);
	System.out.println(resultat);
	double resultat2 = App.additionner(2, 3);
	App.SimpleDate();
	
	}
	
	public static String prenomNom (String prenom, String nom) {
		
		String retour; 
		retour = prenom + " " + nom;
		return retour;
	}
	
	public static double additionner (double valeur1, double valeur2) {
		
		double somme = 0;
		somme = valeur1 + valeur2 ;
		return somme;
	}
	public static void SimpleDate() {
	    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println(s.format(date));
	}
}