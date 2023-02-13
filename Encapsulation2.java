class Students {
	int rollNo;
	String name;

	// Setters
	public void setRoll(int x) {
		rollNo = x;
	}

	public void setName(String s) {
		name = s;
	}

	// Getters

	public int getRoll() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

}

public class Encapsulation2 
{
	public static void main(String[] args)
	{
		Students aditya = new Students();
		aditya.setRoll(4);
		aditya.setName("Aditya");
		System.out.println(aditya.getRoll());
		System.out.println(aditya.getName());
		
		Students jeff = new Students();
		jeff.setRoll(5);
		jeff.setName("Jeff");
		System.out.println(jeff.getRoll());
		System.out.println(jeff.getName());
	}

}
