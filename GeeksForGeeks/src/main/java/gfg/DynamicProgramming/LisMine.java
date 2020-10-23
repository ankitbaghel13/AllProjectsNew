package gfg.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LisMine {

	public static void main(String[] args) {
		
		double start = System.nanoTime();

		int arr[] = {10,22,9,33,21,50,41,60,80};
		List<Integer> list = getLongestIncreasingSubsequence(arr);

		System.out.println(list.toString()+" length : "+list.size());
		
		double end = System.nanoTime();
    	double time = (end - start)/Math.pow(10, 6);
    	
    	System.out.println("Time taken to execute program in ms : "+time);
	}

	private static List<Integer> getLongestIncreasingSubsequence(int[] arr) {

		List<Integer> list = null;
		List<Integer> maxlist = new ArrayList<Integer>();
		int count,k,maxLength;
		int maxCount = 0;
		
		Map<Integer, List<Integer>> lisMap = new TreeMap<Integer, List<Integer>>(); 
		for (int i = 0; i < arr.length-1; i++) {
			
			list = new ArrayList<Integer>();
			list.add(arr[i]);
			count = 1;
			k = i;
			if(maxlist.contains(arr[i]))
				continue;
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[k]<arr[j]){
					list.add(arr[j]);
					count++;
					k=j;
				}
			}
			//System.out.println(list.toString());
			if(count>maxCount){
				lisMap.put(count, list);
				maxCount = count;
				maxlist = list;
			}
			if(maxCount>arr.length-i)
				break;
		}
		
		maxLength = Collections.max(lisMap.keySet());
		return lisMap.get(maxLength);
	}
}
