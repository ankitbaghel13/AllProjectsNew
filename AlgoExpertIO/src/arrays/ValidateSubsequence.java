package arrays;

public class ValidateSubsequence {

	public static void main(String[] args) {

		int[] array = {5,1,22,25,6,-1,8,10};
		int[] sequence = {1,6,-1,8};
		
		//O(n) time | O(1) space
		System.out.println(validateSubsequence(array, sequence));
	}

	private static boolean validateSubsequence(int[] array, int[] sequence) {
		
		int seqIndex=0;
		for(int i : array){
			if(seqIndex<sequence.length && (i==sequence[seqIndex]))
				seqIndex++;
		}
		
		return seqIndex==sequence.length;
	}

}
