
public class Fibonacci {

	public static void main(String[] args) throws Exception {
		//0 1 1 2 3 5 8 13 21 34
		getNthFibo(8);
	}

	
	public static int getNthFibo(int n){
		// write your code here
		int sum=0;
		try {
			int firstNum=0;
			int secondNum=1;
			if(n<1) 
				throw new Exception("Please enter valid inputs");
			else if(n==0) 
				return 0;
			else if(n==1)
				return 1;
			
			for(int i=2;i<n;i++) {
				sum = firstNum+secondNum;
				firstNum = secondNum;
				secondNum = sum;
			}
		}catch(Exception ex) {
			//logs exception
			ex.getMessage();
		}
		return sum;
	}
}
