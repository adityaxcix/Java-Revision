package collection;

import java.util.ArrayList;

public class ArrList 
{

	public static void main(String[] args)
{
		//Creating ArrayList
		ArrayList arr1 = new ArrayList();
		arr1.add("Aditya");
		arr1.add('A');
		arr1.add(23);
		arr1.add(11.3);
		
		//Printing ArrayList
		System.out.println("ArrayList 1 : "+arr1);
		
		//Second ArrayList
		ArrayList arr2 = new ArrayList();
		arr2.add(56);
		arr2.add(123.444);
		System.out.println("ArrayList 2 : "+ arr2);
		
		//To Merge both ArrayLists
		arr2.addAll(arr1);
		System.out.println("Both Arraylists Merged : " + arr2);
		
		//To check if the Value is Present in ArrayList or not
		System.out.println("If Value is present : "+arr1.contains(20));
		
		//To check value at particular index
		System.out.println("Value at index : "+arr2.get(0));
		
		//To check the size of array
		
		int size = arr2.size();
		System.out.println("size of ArrayList: "+size);
		
		//To check if ArrayList is empty or not
		
		System.out.println("Is ArrayList1 is empty? : "+arr1.isEmpty());
		System.out.println("Is ArrayList2 is empty? : "+arr2.isEmpty());
		
		//To get the class of ArrayList
		System.out.println("Class of ArrayLists : "+ arr1.getClass());
		
		
		
	}

}
