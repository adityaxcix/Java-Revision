package in.fileHandling;
import java.io.*;
public class FileHandlingIO 
{

	public static void main(String[] args) throws Exception
	{
		//To make file
		File f = new File("abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
		
		//To make Directory
		File d = new File("Folder");
		System.out.println(d.exists());
		d.mkdir();
		System.out.println(d.exists());
		
		//To create a File inside a Directory
		File cd = new File("wwe");
		cd.mkdir();
		
		File cd1 = new File("wwe","wrestler.txt");
		cd1.createNewFile();
		System.out.println(cd.exists());
		System.out.println(cd1.length());
		
		
		
	}

}
