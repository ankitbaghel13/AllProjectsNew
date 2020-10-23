package arrays;

import java.util.Arrays;

//O((nlogn+mlogm)) + O(n+m) time | O(1) space
public class SmallestDifference {

	public static void main(String[] args) {

		int[] nArray = {-1,5,10,20,28,3};
		//sorted nArray = {-1,3,5,10,20,28}
		int[] mArray = {26,134,135,15,17};
		//sorted mArray = {15,17,26,134,135}
		
		findSmallestDifference(nArray, mArray);
	}

	private static void findSmallestDifference(int[] nArray, int[] mArray) {
	
		Arrays.sort(nArray);
		Arrays.sort(mArray);
		int nNum,mNum;
		int nPtr=0;
		int mPtr=0;
		int first = nArray[nPtr];
		int second = mArray[mPtr];
		int smallestDiff=34567890;
		int currDiff;
		
		while(nPtr<nArray.length && mPtr<mArray.length){
			nNum = nArray[nPtr];
			mNum = mArray[mPtr];
			if(nNum>mNum){
				currDiff = nNum-mNum;
				mPtr++;
			}
			else if(mNum>nNum){
				currDiff = mNum-nNum;
				nPtr++;
			}
			else{
				first = nNum;
				second= nNum;
				break;
			} 
			
			if(currDiff<smallestDiff){
				first = nNum;
				second = mNum; 
				smallestDiff = currDiff;
			}
		}
		
		System.out.println(first+" : "+second);
	}

}
