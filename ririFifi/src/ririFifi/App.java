package ririFifi;

public class App {

	public static void main(String[] args) {
		String[] nom = {"riri", "fifi", "loulou", "Picsou"};
		String phrase = "";


		for (int i = 0; i < nom.length; i++) {
		  if (i == nom.length - 1) {
		    phrase += "et " +nom[i] ; 
		  } else {
		    phrase += nom[i] + ", ";
		  }
		}

		System.out.println(phrase); 
	}

}
