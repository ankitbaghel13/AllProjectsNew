package wissen;

import java.util.HashMap;

public class ProblemSolving {

	public static void main(String[] args) {
		
		HashMap<String,Double> mapForPrice = new HashMap<>();
        HashMap<String,Integer> mapForTick = new HashMap<>();
		
	}
	
	public static void printLetters(){
		

		
		String inputStr = "C2B3A1";
		int value;
		
		for(int i=0;i<inputStr.length();i+=2){
			
			value = inputStr.charAt(i+1)-48;
			for(int j=0;j<value;j++){
				//System.out.println(j+" "+value);
				System.out.print(inputStr.charAt(i));
			}
		}
	
	}
}
