package practice;

public class MethodOverloading_Practice_III {

	public static void main(String[] args) {
		// Method Overloading
		
		int c = add(12,33);
		System.out.println(c);
	}

	static int add(int a, int b) {
		System.out.println("Method with 2 Parameters is running");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("Method with 3 Parameters is running");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("Method with 3 Parameters is running");
		return a + b + c + d;
	}

}
