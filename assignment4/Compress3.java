package assignment4;

public class Compress3 {

	public static int getNumUniqueCharacters(char[] s){
		int num = 1;
		if(s.length > 1){
			for(int i = 1; i < s.length; i++){
				if(s[i] != s[i-1])
					num++;
			}
			return num;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengthOfCurrent = 0;
		System.out.println("Enter the string.");
		String input = IO.readString();
		System.out.println(input);
		char[] cArray = input.toCharArray();
		int uniqueCharacters = getNumUniqueCharacters(cArray);
		int index = 0;
		String[] letters = new String[uniqueCharacters];
		int count = 0;
		if(input.length() > 1){
			for(int i = 0; i < input.length(); i++){
				while(cArray[i] == cArray[i+1]){
					count++;
					
				}
				System.out.println(count);
			}
		}
	}

}
