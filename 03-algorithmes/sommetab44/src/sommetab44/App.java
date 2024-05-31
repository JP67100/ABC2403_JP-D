package sommetab44;

public class App {
	
	public static void main(String[] args) {
		
		float[] tableau = {1.2f, 3.4f, 5.6f, 7.8f, 9.0f, 2.3f, 4.5f, 6.7f, 8.9f, 10.0f};
		float somme = 0.0f;
	       
			for (float valeur : tableau) {
	            somme += valeur;
	            System.out.println("La somme des valeurs du tableau est : " + somme);
	        }
	        
		
	}
}
