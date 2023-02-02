package practice;

import java.util.Scanner;



public class basics_practice_I {

	public static void main(String[] args) 
	{
		/*nested loop
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		String symbol="";
		
		System.out.println("Enter Number of Rows : ");
		row= sc.nextInt();
		
		System.out.println("Enter Number of Coloumns : ");
		col = sc.nextInt();
		
		System.out.println("Enter the character : ");
		symbol = sc.next();
		
		for(int i = 1;i<=row;i++)
		{
			System.out.println("");
				for(int j = 1;j<=col;j++)
				{
				System.out.print(symbol);
				}
		}
		*/
//---------------------------------------------------------------------------------------------------------------
		/* 1 D array

		String cars[] = new String[4];
		cars[0] = "BMW";
		cars[1]= "Honda City";
		cars[2] = "Benz";
		cars[3] = "Ferrari";
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}

*/
//--------------------------------------------------------------------------------------------------------------
		//2D Array
		
		/*String colours[][] = {
								{"red","green","blue"},
								{"white","yellow","Mahroon"},
								{"Grey","Magenta","Sky Blue"}
							 };
		
		
		
		for(int i = 0;i<colours.length;i++)
		{
			System.out.println();
			for(int j=0;j<colours[i].length;j++)
			{
			System.out.print(colours[i][j] + " ");
			}
		}
		
		*/
//-------------------------------------------------------------------------------------------------------------------
		//String Methods
		/*
		String name = "Aditya";
		boolean result = name.equals("Aditya");
		System.out.println(result);
		
		String name1= "Aditya";
		boolean result1 = name.equalsIgnoreCase("aditya");
		System.out.println(result1);
		
		String name3= "Aditya";
		int len = name3.length();
		System.out.println(len);
		
		String name4 = "Aditya";
		char c = name4.charAt(0);
		System.out.println(c);
		
		String name5 = "Aditya";
		int result2 = name5.indexOf("a");
		System.out.println(result2);
		
		String name6 = "Aditya";
		boolean result6 = name6.isEmpty();
		System.out.println(result6);
		
		String name7 = "   Aditya     ";
		String result7 = name7.trim();
		System.out.println(result7);
		*/
//-------------------------------------------------------------------------------------------------------------------
		//Wrapper Class
		
	/*
		
		Boolean a = true;
		Character b = 'A';
		Integer c  = 12;
		Double d = 12.212;
		String e = "Aditya";
		Float f = 1222f;
		
		*/
//-----------------------------------------------------------------------------------------------------------------------
		
		//ArrayList
		
	/*	ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Burger");
		food.add("Momos");
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Coke");
		drinks.add("Pepsi");
		drinks.add("Marinda");
		
	drinks.set(0, "dew");
	drinks.remove(0);
	food.remove(2);
	drinks.set(1, "Limca");	
	drinks.clear();
	food.clear();
		
		
		for(int i=0;i<food.size();)
		{
			System.out.println(food.get(i));
			i++;
		}
		for(int j = 0;j<drinks.size();j++)
		{
			System.out.println(drinks.get(j));
		}
		
		*/
		
//----------------------------------------------------------------------------------------------------------------------
		
		
	
		
		
	}

}
