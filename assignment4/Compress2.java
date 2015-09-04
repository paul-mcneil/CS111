package assignment4;

import java.util.HashMap;

public class Compress2 {

	public static double getMode(double[] list){
		double mode;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i = 0; i < list.length; i++){
			hm.put(list[i], 1);
		}

		for(Double key : hm.keySet()){
			int frequency = 0;
			for(int i = 0; i < list.length; i++){
				
				if(list[i] == key){
					frequency++;
				}
			}
			hm.put(key, frequency);
		}
		
	/*	
		for(Double key : hm.keySet()){
			
			System.out.println(key + " " + hm.get(key));
		}
	*/
		mode = getMostFrequent(hm);
		return mode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
