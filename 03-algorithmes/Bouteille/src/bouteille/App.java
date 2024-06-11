package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille bouteille1 = new Bouteille();

		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "h2o");

		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		Bouteille bouteille4 = new Bouteille(1.2f, 0.5f, true, "h2o");

		Bouteille bouteille5 = new Bouteille(1.2f, 1.3f, false, "h2o");
		
		Bouteille bouteille6 = new Bouteille(1.2f, 0.6f, true, "h2o" );
		
		
		
		
		float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL();

		float contenuEnCLDeBouteille2 = bouteille2.donneContenueEnCL();
		
		boolean ouvrirBouteille = bouteille2.ouvrir();
		
		boolean fermerBouteille = bouteille2.fermer();
		
		boolean bouteilleRempli = bouteille2.laRemplir(0.3f);
		
		boolean bouteillevide = bouteille2.laVider(0.8f);
		
		boolean ContenuTrop = bouteille5.laRemplir (0.7f);
		
		boolean Retirer= bouteille5.laVider(0.4f);
		
		
		
		
	}

}
