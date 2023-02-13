
class teacher
{
	private int age;
	private String name;
	
	public teacher(int age, String name)
	{
		this.age = age;
		this.name = name;
		
	}
	
	public teacher()
	{
		age=12;
		name="kajal";
	}
	
	
	
	
	public int getAge() 
	{
		return age;
	}

	
	public String getName() 
	{
		return name;
	}
	
	
	
}

public class Encapsulation4 
{

	public static void main(String[] args) 
	{
	
		
		teacher aditya = new teacher(10,"Aditya");
		System.out.println(aditya.getAge());
		System.out.println(aditya.getName());
		
		
		teacher kajal = new teacher();
		System.out.println(kajal.getAge());
		System.out.println(kajal.getName());
		 
		

	}

}
