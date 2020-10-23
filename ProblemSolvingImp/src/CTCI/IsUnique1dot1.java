package CTCI;

public class IsUnique1dot1 {

	public static void main(String[] args) {

		String str = "Ankitbaghela";
		
		System.out.println(unique(str));
		System.out.println(uniqueIntArray(str));
	}

	private static boolean unique(String str) {
		// TODO Auto-generated method stub
		if(str.length()>256)
			return false;
		
		boolean b[] = new boolean[256];
		
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(b[val])
				return false;
			b[val] = true;
		}
		return true;
	}
	
	private static boolean uniqueIntArray(String str) {
		// TODO Auto-generated method stub
		if(str.length()>256)
			return false;
		
		int a[] = new int[256];
		
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			a[val]++;
			
			//For 26
			//a[val-'a']++;
			
			if(a[val]>1)
				return false;
		}
		return true;
	}

}
