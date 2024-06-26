package ExoSophiePropre;

public class ExoSophiePropre {

	public static void main(String[] args) {

		int[] tab = new int[] { 2, 5, 18, 46 };
		int chiffreARechercher = 5;
		boolean existe = rechercherSiChiffreExiste(tab, chiffreARechercher);
		System.out.println("Le chiffre " + chiffreARechercher + " existe-t-il dans le tableau ? " + existe);

	}

	public static boolean rechercherSiChiffreExiste(int[] tab, int chiffreARechercher) {

		boolean ok = false; // Initialise un booléen sur Faux pour indiquer si le numéro est trouvé

		int i = 0; // Index pour parcourir le tableau

		while (i < tab.length && !ok) { // Boucle while

			if (tab[i] == chiffreARechercher) { // Vérification si l'élément correspond au chiffre recherché
				ok = true; // Mise à jour de la variable booléenne
			}

			i++; // Incrémentation de l'index
		}

		return ok; // Retour de la valeur booléenne

	}

}
