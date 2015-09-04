package assignment4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = IO.readString();
		String word = IO.readString();
		
		int wordLen = word.length();
		int count = 0;
		for(int i = 0; i < input.length() - wordLen + 1; i++){
			
			String temp = input.substring(i, wordLen);
			
			if(word.equalsIgnoreCase(temp))
				count++;
		}
		
		System.out.println(count);
	}

}
