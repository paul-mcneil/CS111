package assignment4;

public class PigLatin {

	public static boolean isVowel(char letter){
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word to translate to PigLatin:");
		String input = IO.readString();
		String lower = input.toLowerCase();
		char[] cArray = lower.toCharArray();
		int length = input.length();
		
		
		if(isVowel(cArray[0])){
			String way = "way";
			String result = input.concat(way);
			System.out.println("Starts with a vowel.");
			IO.outputStringAnswer(result);
			
		}else{
			/*
			 * Move the consonant to the end of the word
			 * add "ay" to the end
			 */
			System.out.println("Starts with a consonant");
			String ay = "ay";
			char[] temp = new char[length];
			for(int i = 0; i < length -1; i++){
				temp[i] = cArray[i+1];
			}
			temp[length-1] = cArray[0];
			String result = new String(temp);
			result = result.concat(ay);
			IO.outputStringAnswer(result);
		}

	}

}
