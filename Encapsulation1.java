class student {
	private int rollNo;
	public void setrollNo(int x) {
		
		if(x>0) 
		{
		rollNo = x;
		}
		
		else {
			System.out.println("Enter a valid number");
		}
		
		
	}
	public int getrollNo() {
		return rollNo;
	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		student aditya = new student();
		
		aditya.setrollNo(-12);
		System.out.println(aditya.getrollNo());
	}
}
