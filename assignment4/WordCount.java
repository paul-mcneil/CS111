package assignment4;

public class WordCount {

	public static int getTotalNumWords(String input) {
		int total = 0;
		char[] cArray = input.toCharArray();
		if(input.length() > 0)
			total++;
		for(int i = 0; i < input.length(); i++) {
			
			if(Character.isWhitespace(cArray[i]))
				total++;
		}
		return total;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the string.");
		String input = IO.readString();
		System.out.println("Enter minimum word length.");
		int minimumLength = IO.readInt();
		int currentWordLength = 0;
		//System.out.println(input);
		char[] cArray = input.toCharArray();
		//System.out.println(cArray[0]);
		int numWords = 0;
		
		
		for(int i = 0; i < input.length(); i++){
			
			if(!Character.isWhitespace(cArray[i])) {
				currentWordLength++;
				//System.out.println(currentWordLength);
			}
				
			else if(Character.isWhitespace(cArray[i])) {
				if(currentWordLength >= minimumLength) {
					numWords++;
					currentWordLength = 0;
				}
				else {
					currentWordLength = 0;
					continue;
				}
						
			}	
			else
				continue;	
		}
		IO.outputIntAnswer(numWords);
	}

}
