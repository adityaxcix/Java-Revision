package practice;

public class Objects_Practice_V {

	public static void main(String[] args) {
		//OOPS  : Objects
		
		wwe rey_mysterio  = new wwe();
		System.out.println(rey_mysterio.name);
		rey_mysterio.signature();
		rey_mysterio.finisher();

	}

}

 class wwe
{
	String name = "Rey Mysterio";
	float height = 168f;
	float weight = 79f;
	String origin = "Mexico";
	long salary = 160000l;
	
	void signature()
	{
		System.out.println("619 is the signature");
	}
	
	void finisher()
	{
		System.out.println("Frog Splash is the finisher");
	}
	
	
	
	
}