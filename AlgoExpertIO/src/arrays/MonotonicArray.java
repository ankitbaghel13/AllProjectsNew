package arrays;

public class MonotonicArray {

	public static void main(String[] args) {

		int[] array = {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};
//		int[] array = {1,1,1,2,1};
		//System.out.println(checkForMonotonicArray(array));
		System.out.println(checkForMonotonicSimpleArray(array));
	}

	private static boolean checkForMonotonicSimpleArray(int[] array) {

		boolean isIncreasing=true;
		boolean isDecreasing=true;
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]<array[i+1])
				isDecreasing=false;
			if(array[i]>array[i+1])
				isIncreasing=false;
		}
		return isIncreasing || isDecreasing;
	}

	private static boolean checkForMonotonicArray(int[] array) {

		int isIncreasing=0;
		int i=0;
		while(i<array.length-1) {
			if(array[i]==array[i+1]) {
				i++;
				continue;
			}else if(array[i]<array[i+1]) {
				isIncreasing=1;
				break;
			}else {
				isIncreasing=2;
				break;
			}
		}
		
		if(isIncreasing==0)
			return false;
		else if(isIncreasing==1){
			for(int j=i;i<array.length-1;i++) {
				if(array[i]>array[i+1])
					return false;
			}
		}else {
			for(int j=i;i<array.length-1;i++) {
				if(array[i]<array[i+1])
					return false;			
			}
		}
		return true;
	}

}
