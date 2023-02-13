class Student11
{
	private int rollNo; //Instance
	private String Name;
	
	public Student11(int rollNO , String Name) 
	{
		this.rollNo=rollNO;
		this.Name=Name;
	}
	
	
	//Getters
	
	public int getrollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return Name;
	}

}

public class Encapsulation3
{

	public static void main(String[] args) 
	{
		Student11 kajal = new Student11(2, "Kajal");
		Student11 aditya = new Student11(4, "Aditya");
		
	
		System.out.println(kajal.getrollNo());
		System.out.println(kajal.getName());
		System.out.println();
		System.out.println(aditya.getrollNo());
		System.out.println(aditya.getName());
		
		
		
	}

}
