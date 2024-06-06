package bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille ();
	
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "h2o");
		
		Bouteille bouteille3 =new Bouteille(bouteille2);
		
	float contenanceEnCLDeBouteille2 =	bouteille2.donneContenanceEnCL();

	
	
	
	
	
	}
	
	
	

}
