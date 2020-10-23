package vmware;

import java.util.Arrays;

public class RemoveSubSequence {

	public static void main(String[] args) {

		String[] resultArray = removeSubsequencePresent();
		
		System.out.println(Arrays.toString(resultArray));
	}

	public static String[] removeSubsequencePresent() {
		String t = "i am using hackerrank to improve my programming";
		String s = "am hackerrank improve";
		
		String[] mainArray = t.split(" ");
		String[] subArray = s.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		boolean isPresent;
		
		for(int i=0;i<mainArray.length;i++){
			
			isPresent = false;
			for(int j=0;j<subArray.length;j++){

				if(mainArray[i].equals(subArray[j])){
					
					isPresent = true;
					break;
				}
			}
			
			if(!isPresent){
				sb.append(mainArray[i]+" ");
			}
		}
		
		return sb.toString().split(" ");
	}

}
