package recursion;

public class Recursion {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorialRec(5));

		System.out.println(multiplyRec(5,4));
		System.out.println(multiply(5,4));
	}

	private static int multiply(int n, int m) {

		int product=0;
		for(int i=1;i<=m;i++)
			product += n;
		return product;
	}

	private static int multiplyRec(int n, int m) {

		if(m==0) return 0;
		else return n+multiplyRec(n, m-1); 
	}


	private static int factorial(int n) {

		int factorial=1;
		for(int i=n;i>0;i--)
			factorial *= i;
		return factorial;
	}

	private static int factorialRec(int n) {

		if(n==1)
			return 1;
		else
			return n * factorialRec(n-1);

	}
}
