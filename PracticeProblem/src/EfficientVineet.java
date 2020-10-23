import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EfficientVineet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int len = scanner.nextInt();
		int len = 200;
		//double[] array = new double[200];
		
		/*
		 * for(int i=0;i<len;i++) { array[i] = scanner.nextDouble(); }
		 */
		
		double[] array = {2.02d,2.95d,1.14d
				,2.13d
				,1.86d
				,1.45d
				,1.5d
				,2.77d
				,1.55d
				,1.49d
				,1.2d
				,2.89d
				,2.0d
				,1.75d
				,2.56d
				,2.05d
				,2.19d
				,1.11d
				,1.81d
				,2.45d
				,1.37d
				,2.67d
				,1.63d
				,1.89d
				,1.76d
				,2.05d
				,2.98d
				,2.53d
				,2.15d
				,1.21d
				,2.43d
				,2.21d
				,2.15d
				,2.85d
				,1.28d
				,2.17d
				,1.52d
				,1.33d
				,2.14d
				,2.93d
				,1.39d
				,2.83d
				,1.19d
				,1.21d
				,1.09d
				,1.77d
				,2.93d
				,2.53d
				,1.4d
				,2.49d
				,2.81d
				,2.05d
				,2.48d
				,2.47d
				,1.95d
				,1.41d
				,2.12d
				,2.45d
				,1.68d
				,1.57d
				,1.66d
				,1.69d
				,1.68d
				,2.93d
				,1.27d
				,1.77d
				,2.97d
				,1.89d
				,2.15d
				,1.37d
				,1.35d
				,2.05d
				,1.12d
				,1.37d
				,2.89d
				,2.05d
				,1.11d
				,2.23d
				,2.6d
				,1.33d
				,1.42d
				,1.31d
				,1.89d
				,2.33d
				,1.94d
				,1.47d
				,2.29d
				,2.61d
				,2.92d
				,2.45d
				,1.89d
				,1.49d
				,2.34d
				,2.63d
				,1.82d
				,2.53d
				,1.59d
				,2.03d
				,1.92d
				,1.65d
				,2.17d
				,2.67d
				,1.43d
				,1.17d
				,1.61d
				,2.51d
				,2.48d
				,2.25d
				,1.56d
				,2.39d
				,2.12d
				,2.61d
				,2.76d
				,1.93d
				,1.71d
				,2.57d
				,2.77d
				,2.47d
				,2.36d
				,2.05d
				,1.5d
				,1.25d
				,1.98d
				,1.41d
				,1.46d
				,1.63d
				,2.67d
				,1.57d
				,2.25d
				,1.31d
				,1.41d
				,2.45d
				,1.47d
				,2.93d
				,1.46d
				,1.73d
				,1.82d
				,2.07d
				,1.86d
				,1.05d
				,2.29d
				,1.35d
				,1.98d
				,1.97d
				,2.4d
				,1.53d
				,2.65d
				,2.29d
				,1.12d
				,1.35d
				,1.45d
				,2.77d
				,2.61d
				,2.63d
				,1.96d
				,2.25d
				,2.14d
				,1.87d
				,1.94d
				,2.93d
				,2.88d
				,2.19d
				,2.02d
				,2.53d
				,1.38d
				,1.27d
				,2.11d
				,1.49d
				,2.2d
				,1.83d
				,1.32d
				,2.25d
				,1.65d
				,2.37d
				,2.57d
				,2.29d
				,2.29d
				,1.09d
				,2.99d
				,1.01d
				,1.73d
				,1.89d
				,2.47d
				,1.09d
				,2.69d
				,2.71d
				,2.73d
				,1.69d
				,1.31d
				,1.23d
				,2.36d
				,2.29d
				,1.1d
				,1.99d
				,1.44d
				,2.89d
				,1.32d
				,1.93d
				,1.72d
				,1.17d};
		//System.out.println(Arrays.toString(array));
		
		//[1.01, 1.99, 2.5, 1.5, 1.01], 
		//Vineet can carry all of the trash in 3 trips: 
		//[1.01 + 1.99, 2.5, 1.5+1.01]
		
		//[1.05, 1.05, 1.05, 1.05, 1.05]
		
		//[1.01, 1.30, 1.20, 1.98, 1.30, 2.10]
		//[1.01 + 1.98, 1.30 + 1.20, 1.30, 2.10]
		//Iterator<Double> iterator = list.iterator();
		double maxSum = 0;
		double currSum = 0;
		int first=-1;
		int second=-1;
		int trips=0;
		for(int i=0;i<len;i++) {
			
			maxSum=0;
			currSum=0;
			first = -1;
			second = -1;
			
			if(array[i]==0)
				continue;
			
			if(array[i]!=0 && i==len-1) {
				trips++;
				continue;
			}
			
			for(int j=i+1;j<len;j++) {
				
				currSum = array[i]+array[j];
				
				if(currSum == 3.00) {
					maxSum = currSum;
					first = i;
					second = j;
					break;
				}else if(currSum < 3.00 && currSum>maxSum) {
					maxSum = currSum;
					first = i;
					second = j;
				}
			}
			
			if(first!=-1 && second !=-1) {
				array[first]=0;
				array[second]=0;
			}else {
				array[i]=0;
			}
			trips++;
		}
		
		System.out.println(trips);
		scanner.close();
	}

}
