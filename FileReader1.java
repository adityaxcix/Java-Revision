package in.fileHandling;

import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("info.txt");
		int i=fr.read();
		while( i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		
		fr.close();
		

	}

}
