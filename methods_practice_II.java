package practice;
import java.util.Scanner;

public class methods_practice_II {

	public static void main(String[] args) {
		
		String name = "Aditya";
		hello();
		name(name);
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter the Age " );
		int age = obj1.nextInt() ;
		
		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter Weight in kg ");
		float weight = obj2.nextFloat();
		
		Scanner obj3 = new Scanner(System.in);
		System.out.print("Enter Height in cm ");
		float height = obj2.nextFloat();
		MetaData(age, weight, height);

				
		

	}
	
	static void hello()
	{
		System.out.println("Hello ");
	}

	static void name(String s)
	{
		System.out.println("My name is  " + s);
	}
	
	
	
	static void MetaData(int age, float weight , float height)
	{
		System.out.println("Age is : " + age);
		System.out.println("Weight is :" + weight + " kg");
		System.out.println("Height is :" + height + " cm");
	}
	
}

