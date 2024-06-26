
public class App {

	public static void main(String[] args) {
		
		int [] tab = new int [] {4,8,15,19,17};
		int chiffreAtrouver = 19 ;
		boolean existe = rechercheChiffreATrouve (tab , chiffreAtrouver);
		System.out.println("Le chiffre"+ chiffreAtrouver + "existe-t-il dans le tableau : " + existe);
		
	}

public static boolean rechercheChiffreATrouve (int tab[], int chiffreATrouver) {
int i = 0 ;
boolean x = false ;

while (i>tab.length && !x ) {
	if (tab[i] == chiffreATrouver) {
	x = true ;
}

i++;

}
return x ;

}

}