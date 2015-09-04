package assignment5;

public class Sorting {

	public static void printCharArray(char[] A){
		for(int i = 0; i < A.length; i++){
			System.out.print(A[i] + " ");
		}
	}
	static void insertionSort(char[] A) {
	      // Sort the array A into increasing order.
	   int numCompares = 0;
	   int itemsSorted; // Number of items that have been sorted so far.

	   for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
	         // Assume that items A[0], A[1], ... A[itemsSorted-1] 
	         // have already been sorted.  Insert A[itemsSorted]
	         // into the sorted part of the list.
	      printCharArray(A);
	      System.out.print(" " + numCompares);
	      System.out.println("");
	      char temp = A[itemsSorted];  // The item to be inserted.
	      int loc = itemsSorted - 1;  // Start at end of list.
	    
	      while (loc >= 0 && Character.compare(A[loc], temp) > 0) {
	         A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
	         loc = loc - 1;       // Go on to next location.
	         numCompares++;
	      }
	      
	      A[loc + 1] = temp; // Put temp in last vacated space.
	   }
	   
	}
	
	static void selectionSort(char[] A) {
	      // Sort A into increasing order, using selection sort
	  // int totalCompares = 0;
	   int numCompares = 0;
	   for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
	         // Find the largest item among A[0], A[1], ...,
	         // A[lastPlace], and move it into position lastPlace 
	         // by swapping it with the number that is currently 
	         // in position lastPlace.
	         
	      int maxLoc = 0;  // Location of largest item seen so far.
	      printCharArray(A);
	      System.out.print(" " + numCompares);
	      System.out.println("");
	      numCompares = 0;
	      for (int j = 1; j <= lastPlace; j++) {
	         if (Character.compare(A[j], A[maxLoc]) > 0) {
	        	 numCompares++;
	               // Since A[j] is bigger than the maximum we've seen
	               // so far, j is the new location of the maximum value
	               // we've seen so far.
	            maxLoc = j;  
	         }
	      }
	      
	      char temp = A[maxLoc];  // Swap largest item with A[lastPlace].
	      A[maxLoc] = A[lastPlace];
	      A[lastPlace] = temp;
	      
	   }  // end of for loop
	   
	}
	
	public static boolean isEqual(int[] A, int[] B){
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] letters = { 'M', 'Q', 'E', 'J', 'R', 'Q', 'X', 'B' };
		char[] letters2 = { 'M', 'Q', 'E', 'J', 'R', 'Q', 'X', 'B' };
		int result = Character.compare(letters[0], letters[1]);
		
		insertionSort(letters);
		
		for(int i = 0; i < letters.length; i++){
			System.out.print(letters[i] + " ");
		}
		System.out.println("");
		System.out.println("Selection Sort:");
		selectionSort(letters2);
		for(int i = 0; i < letters2.length; i++){
			System.out.print(letters2[i] + " ");
		}
		//System.out.println(result);
	}
}
