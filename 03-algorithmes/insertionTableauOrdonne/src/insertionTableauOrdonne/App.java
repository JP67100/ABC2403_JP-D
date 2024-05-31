package insertionTableauOrdonne;

public class App {

	public static void main(String[] args) {
		int nombreAInserer = 7;
		int tab[] = { 1, 4, 5, 10, 20, 22, 25, 30, 32 };

		// Create a new array with one extra element
		int newArray[] = new int[tab.length + 1];

		// Copy elements from the original array
		System.arraycopy(tab, 0, newArray, 0, tab.length);

		// Find the insertion position for 7 (assuming ascending order)
		int insertionIndex = 0;
		while (insertionIndex < newArray.length && newArray[insertionIndex] < nombreAInserer) {
			insertionIndex++;
		}

		// Shift elements to make space for 7
		System.arraycopy(newArray, insertionIndex, newArray, insertionIndex + 1, newArray.length - insertionIndex - 1);

		// Insert 7 at the correct position
		newArray[insertionIndex] = nombreAInserer;

		// Print the new sorted array with 7 inserted
		System.out.println("Nouveau tableau trié avec 7 inséré:");
		for (int element : newArray) {
			System.out.print(element + " ");
		}
	}
}
