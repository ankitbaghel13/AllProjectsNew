package string.Search;

public class PermutationWoDup {

	static int count = 0;
	
	public static void main(String[] args) {

		String str = "ABCD";
		
		permute(str,0,str.length()-1);
		System.out.println(count);
	}

	private static void permute(String str, int l, int r) {

		if(l==r){
			System.out.println(str);
			count++;
		}
		else{
			for(int i=l;i<=r;i++){
				str = swap(str,l,i);
				permute(str,l+1,r);
				str = swap(str,l,i); // BackTracking
			}
		}
	}

	private static String swap(String str, int l, int i) {

		char temp; 
		char[] chArray = str.toCharArray();
		
		temp = chArray[i];
		chArray[i] = chArray[l];
		chArray[l] = temp;
		
		return String.valueOf(chArray);
	}

}
