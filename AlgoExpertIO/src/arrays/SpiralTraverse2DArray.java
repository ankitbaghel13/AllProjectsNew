package arrays;

public class SpiralTraverse2DArray {

	public static void main(String[] args) {
		int array[][] = {{1, 2, 3, 4,17},
					 	 {5, 6, 7, 8,18},
					 	 {9,10,11,12,19},
					 	{13,14,15,16,20}
					};
		printNormalTraverse(array);
		printSpiralTraverse(array);
	}

	private static void printSpiralTraverse(int[][] array) {
	
		System.out.println("Spiral Traversal");
		System.out.println("-----------------");
		int sRow = 0;
		int eRow = array.length-1;
		int sCol = 0;
		int eCol = array[0].length-1;
		
		while(sRow<=eRow && sCol<=eCol) {
			
			for(int i=sCol;i<=eCol;i++)
				System.out.print(array[sRow][i]+" ");
			
			for(int i=sRow+1;i<=eRow;i++)
				System.out.print(array[i][eCol]+" ");
			
			for(int i=eCol-1;i>=sCol;i--)
				System.out.print(array[eRow][i]+" ");
			
			for(int i=eRow-1;i>=sRow+1;i--)
				System.out.print(array[i][sCol]+" ");
			
			sCol++;
			eCol--;
			eRow--;
			sRow++;
		}
	}
	
	private static void printNormalTraverse(int[][] array) {
		System.out.println("Normal Traversal");
		System.out.println("-----------------");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
