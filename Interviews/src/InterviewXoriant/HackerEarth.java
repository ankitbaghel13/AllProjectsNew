package InterviewXoriant;

import java.util.*;

class HackerEarth
{
	public static void main(String args[])
	 {
		
		System.out.println(findResult(100,135172));
		//6+2-> 8+4-> 12+6-> 18+6-> 24
		//10 6+2 8+4 12+4 16+4
	}

	static int findResult(int N, int M) {

		if(N%2 !=0 || M%2 !=0){
			return -1;
		}
		
		int currentSum=0;
		int optimumDivisor=0;
		//6+2-> 8+4-> 12+6-> 18+6-> 24+6 -> 30 
		//10 6+2 8+2
		while(N<=M) {
			List<Integer> list =  findDivisors(N);
			
			optimumDivisor = findOptimumDivisor(list,N,M);
			System.out.print(N+"+"+optimumDivisor+"-> ");
			if(optimumDivisor==-1)
				return -1;
			
			currentSum += N/optimumDivisor;
			N += optimumDivisor;
			
			if(N==M)
				return currentSum;
		}

		return 0;
	}

	static int findOptimumDivisor(List<Integer> list, int N, int M) {
		
		int result=0;
		//12+2 -> 14
		
		//6+2-> 8+4-> 12+6-> 18+6-> 24
		
		//8+4-> 12    10
		//10 6+2 8+2
		for(int i=0;i<list.size();i++) {
			int current = list.get(i);
			int currentSum = N+current;
			if(currentSum<=M){
				//result += N/current;
				result=current;
				break;
			}
		}
		
		return result==0 ? -1 : result;
	}

	static List<Integer> findDivisors(int n) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=2;i<=n/2;i+=2) {
			if(n%i==0)
				list.add(i);
		}
		
		Collections.reverse(list);
		
		return list;
		
	}
}