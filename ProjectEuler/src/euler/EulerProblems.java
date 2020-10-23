package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EulerProblems {

	public static void main(String[] args) {

		EulerProblems main = new EulerProblems();
		/*main.projectEuler3();
		main.projectEuler3n();*/
		
		main.transpose();
	}
	
	public void insertionSort(){
		/*
		int a[] = {9,6,7,3,1,4,2};
		
		int key=0;
		int l = 0;
		for (int i = 1; i < a.length; i++) {
			l = i;
			for (int j = l-1; j >=0; j--) {
				if(a[j]>a[l]){
					key = a[j];
					a[j] = a[l];
					a[l] = key;
					l=l-1;
				}
			}
			for (int k : a) {
				System.out.print(k);
			}
			System.out.println();
		}*/
		
		int a[] = {9,6,7,3,1,4,2};
		
		for(int j=1;j<a.length;j++){
			
			int key = a[j];
			int i = j-1;
			while(i>-1 && (a[i]>key)){
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
			for (int k : a) {
				System.out.print(k+",");
			}
			System.out.println();
		}
		
	}
	
	public void transpose(){
		
		int a[][] = {{2,3},{4,5}};
		
		int b[][] = new int[2][2];
		
		int c[][] = new int[2][2];
		
		System.out.println("Original matrix");
		System.out.println("------------------");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("Transposed matrix");
		System.out.println("------------------");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				c[i][j] = a[i][j]*b[i][j]; //+ a[i][j+1]*b[i][j+1];
			}
		}
		
		System.out.println("Multiplied matrix");
		System.out.println("------------------");
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public void floatNo(float n) {
		String floatString = Float.toString(n);

		int space = floatString.indexOf(46);
		System.out.println(space);
		floatString = floatString.replace(".", "");

		int reverse = reverse(Integer.valueOf(floatString));

		floatString = String.valueOf(reverse);

		String before = floatString.substring(0, floatString.length() - space);
		String after = floatString.substring(floatString.length() - space,
				floatString.length());
		String result = before + "." + after;
		System.out.println(result);

		/*
		 * String arr[] = floatString.split(".");
		 * 
		 * int before = Integer.parseInt(arr[1]); int after =
		 * Integer.parseInt(arr[1]);
		 * 
		 * reverse(before); reverse(after);
		 */

	}

	public int reverse(int n) {

		int rem = 0;
		int result = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			result = result * 10 + rem;
		}
		return result;

	}

	public void projectEuler18() {

		long start = System.currentTimeMillis();
		int max = 0;
		int array[][] = { { 75 }, { 95, 64 }, { 17, 47, 82 },
				{ 18, 35, 87, 10 }, { 20, 04, 82, 47, 65 },
				{ 19, 01, 23, 75, 03, 34 }, { 88, 02, 77, 73, 07, 63, 67 },
				{ 99, 65, 04, 28, 06, 16, 70, 92 },
				{ 41, 41, 26, 56, 83, 40, 80, 70, 33 },
				{ 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 },
				{ 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 },
				{ 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 },
				{ 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 },
				{ 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 },
				{ 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time / 1000);
	}

	// Calender
	public void projectEuler19() {

		long start = System.currentTimeMillis();

		int days_in_month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };

		int oddDays = 2;
		int answer = 0;

		for (int year = 1901; year <= 2000; year++) {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				days_in_month[2] = 29;
			} else {
				days_in_month[2] = 28;
			}
			// System.out.println(month[2]+""+year);
			for (int i = 1; i < days_in_month.length; i++) {

				oddDays += days_in_month[i] % 7;

				if (oddDays == 0 || oddDays % 7 == 0) {
					if (i == 12) {
						System.out.println(1 + " " + (year + 1));
					} else {
						System.out.println(i + 1 + " " + year);
					}
					oddDays = 0;
					++answer;
				}
			}
		}
		System.out.println(answer);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}

	// Factorial digit sum
	public void projectEuler20() {

		long start = System.currentTimeMillis();
		int no = 100;
		BigInteger sum = new BigInteger("1");
		for (int i = no; i > 1; i -= 2) {
			sum = sum.multiply(BigInteger.valueOf(i * (i - 1)));

		}

		String sumString = sum.toString();
		int sumOfDigits = 0;

		for (int i = 0; i < sumString.length(); i++) {
			sumOfDigits += Character.getNumericValue(sumString.charAt(i));
		}

		System.out.println(sumOfDigits);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}

	// Sum of amicable numbers under 10000
	public void projectEuler21() {

		long start = System.currentTimeMillis();

		int sum = 1;
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);

		for (int i = 2; i < 10000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			list.add(i, sum);
			sum = 1;
		}

		int amicableSum = 0;

		for (int i = 2; i < 10000; i++) {
			for (int j = i; j < 10000; j++) {
				if (list.get(i) == j && list.get(j) == i && i != j) {
					amicableSum += i + j;
					// System.out.println(i+" "+j);
					break;
				}

			}
		}

		System.out.println(amicableSum);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}

	// Names scores
	public void projectEuler22() {

		long start = System.currentTimeMillis();
		String s = "";

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(
					"C:/Users/Ankit Baghel/Desktop/p022_names.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (scanner.hasNext()) {
			s += scanner.next();
		}
		// System.out.println(s);

		String r = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '"') {
				r += s.charAt(i);
			}
		}
		// System.out.println(r);

		String score[] = r.split(",");
		Arrays.sort(score);
		// System.out.println(score);

		int sum = 0;
		int sol = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length(); j++) {
				sum += (int) score[i].charAt(j) - 64;
			}
			sol += sum*(i+1);
			sum=0;
		}
		System.out.println(sol);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}


	//Multiples of 3 & 5 
	public void projectEuler1(){

		long start = System.currentTimeMillis();
		int sum = 0;

		for(int i=3;i<1000;i++){
			if(i%3==0 || i%5==0){
				sum = sum + i;
			}
		}

		System.out.println("Sum is "+sum);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}


	//Even fibonacci numbers
	public void projectEuler2(){

		long start = System.currentTimeMillis();
		int sum = 2;

		int first = 1;
		int second = 2;
		
		for(int i=3;i<4000000;){
			i = first + second;

			if(i%2==0){
				sum +=i;
			}

			first = second;
			second = i;

		}


		System.out.println("Sum is "+sum);

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}
	
	
	//Largest prime factor
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void projectEuler3(){

		long start = System.currentTimeMillis();
		
		long no = 600851475143l;
		
		List list = new ArrayList();
		
		for(int i=2;i<=Math.sqrt(no);i++){
			if(no%i==0 && isPrime(i)){
				list.add(i);
			}
			//System.out.println(list);
		}


		System.out.println("Max prime factor is "+list.get(list.size()-1));

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}
	
	public void projectEuler3n(){

		long start = System.currentTimeMillis();
		
		//long no = 600851475143l;
		long no = 24l;
		
		List<Long> list = new ArrayList<Long>();
		
		for(long i=2;i<=no;i++){
			if(no%i==0){
				no /= i;
				list.add(i);
			}
			System.out.println(list);
		}


		System.out.println("Max prime factor is "+list.get(list.size()-1));

		long time = System.currentTimeMillis() - start;
		System.out.println("Time is : " + time + " ms");
	}
	
	public boolean isPrime(long no){
		if(no%2==0){
			return false;
		}
		
		for(int i=3;i<=Math.sqrt(no);i+=2){
			if(no%i==0){
				return false;
			}
		}
		return true;
	}





}
