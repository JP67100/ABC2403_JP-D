package lesFruitsEtLesLegumes;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {

/*L’utilisateur peut saisir des noms de légumes. 
Pour chaque légume, l’utilisateur précise un prix au kilo.
Exemple : “carottes 2.99”
Lorsque l’utilisateur saisit la valeur “go”, le programme affiche la liste des légumes avec leur prix ainsi que le légume le moins cher.
Exemple :
1 kilogramme de carottes coute 2.99 euros.  1 kilogramme de poireaux coute 1.99 euros.
[...]
*///  Légume le moins cher au kilo : poireaux 

		  public static void main(String[] args) {
		        // Création d'une HashMap pour stocker les légumes et leurs prix
		        Map<String, Double> legumes = new HashMap<>();

		        // Scanner pour lire l'entrée utilisateur
		        Scanner scanner = new Scanner(System.in);

		        // Boucle pour saisir les légumes et leurs prix
		        String saisie;
		        do {
		            System.out.println("Entrez un nom de légume et son prix au kilo (ex: carottes 2.99): ");
		            saisie = scanner.nextLine();

		            if (!saisie.equals("go")) {
		                String[] split = saisie.split(" ");
		                String nomLegume = split[0];
		                double prixKilo = Double.parseDouble(split[1]);
		                legumes.put(nomLegume, prixKilo);
		            }
		        } while (!saisie.equals("go"));

		        // Affichage de la liste des légumes et de leur prix
		        System.out.println("Liste des légumes et de leurs prix : ");
		        for (Map.Entry<String, Double> legume : legumes.entrySet()) {
		            System.out.println("1 kilogramme de " + legume.getKey() + " coute " + legume.getValue() + " euros.");
		        }

		        // Trouver le légume le moins cher
		        double prixMin = Double.MAX_VALUE;
		        String legumeMoinsCher = null;
		        for (Map.Entry<String, Double> legume : legumes.entrySet()) {
		            if (legume.getValue() < prixMin) {
		                prixMin = legume.getValue();
		                legumeMoinsCher = legume.getKey();
		            }
		        }

		        // Affichage du légume le moins cher
		        System.out.println("\nLégume le moins cher au kilo : " + legumeMoinsCher);

		        scanner.close();
		    }
		}
	
	
	
	
	
	
	
	
	
	
	
	}

}
