package customImplementation;

import java.util.Arrays;

/**
 * 
 * @author Ankit
 *
 */
public class MyArrayList {

	Object[] arrayList;
	int arrSize = 0;

	public MyArrayList() {
		arrayList = new Object[10];
	}

	public static void main(String[] args) {

		MyArrayList arrayList = new MyArrayList();
		arrayList.add(new Integer(6));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(7));
		arrayList.add(new Integer(9));
		
		for (int i = 0; i < 10; i++) 
			arrayList.add((int)(Math.random()*50+1));
		
		arrayList.display();
		arrayList.get(2);
		arrayList.size();
		arrayList.remove(2);
		arrayList.display();
		arrayList.size();

	}


	private void display() {

		for (int i = 0; i < arrSize; i++) {
			System.out.print(arrayList[i]+" ");
		}
		System.out.println();
	}


	private Object remove(int i) {

		if(i<0 || i>=arrSize)
			throw new IndexOutOfBoundsException();
		
		Object removedElement = arrayList[i];
		
		for (int j = i; j < arrSize; j++) 
			arrayList[j] = arrayList[j+1];

		arrSize--;
		System.out.println("Element at index "+i+" i.e. "+removedElement+" is removed");
		
		return removedElement;

	}


	private Object get(int i) {

		if(i<arrSize){
			System.out.println("Retreived element is : "+arrayList[i]);
			return arrayList[i];
		}
		else 
			throw new ArrayIndexOutOfBoundsException();
	}


	private int size() {

		System.out.println("Size of arrayList is : "+arrSize);
		return arrSize;
	}


	private void add(Object no) {

		if(arrayList.length-arrSize<=5)
			ensureCapacity();
		arrayList[arrSize++] = no;
		System.out.println(no+" no element added at "+(arrSize-1)+" index");
	}


	private void ensureCapacity() {

		arrayList = Arrays.copyOf(arrayList, arrayList.length*2);
		System.out.println("Capacity Increased\nNew length = "+arrayList.length);
	}
}
