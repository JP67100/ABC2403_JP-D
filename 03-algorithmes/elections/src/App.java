import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		//Saisie des scores des candidats
		System.out.println("Veuillez saisir le score du premier candidat :");
		double scoreCandidat1 = scanner.nextDouble();
		System.out.println("Veuillez saisir le score du candidat 2 :");
        double scoreCandidat2 = scanner.nextDouble();
        System.out.println("Veuillez saisir le score du candidat 3 :");
        double scoreCandidat3 = scanner.nextDouble();
        System.out.println("Veuillez saisir le score du candidat 4 :");
        double scoreCandidat4 = scanner.nextDouble();
        
        double totalVotes = scoreCandidat1 + scoreCandidat2 + scoreCandidat3 + scoreCandidat4 ;
       
        double partSuffrage = (scoreCandidat1/totalVotes)*100;
       
        if (partSuffrage>50) {
        	System.out.println("Bravo candidat numéro 1 vous êtes élu au premier tour.");
        	}
        
        else if (partSuffrage<50 && partSuffrage>=12.5) { 
        	System.out.println("Bravo candidat1 vous êtes au deuxième tour");
        
        	if (scoreCandidat1 > scoreCandidat2 && scoreCandidat1 > scoreCandidat3 && scoreCandidat1 > scoreCandidat4) 
        	{
                System.out.println("vous est en ballottage favorable.");
             }
        	else 
        	{
                System.out.println("vous est en ballottage défavorable.");
            }
        
        
        }
        
        else {
			System.out.println("Vous n'êtes pas élu ");
		}
      
            
           
            scanner.close();
        }
            

        
     
    
        
       
        
	

}
