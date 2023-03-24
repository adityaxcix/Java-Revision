package in.fileHandling;

import java.io.*;

public class FileWriter1 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("info.txt");
		
		//Use 'true' in case you want to append file data
		//FileWriter fw = new FileWriter("info.txt",true);
		
		fw.write("Hello i am Aditya and i am from dehradun\n");

		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.flush();
		fw.close();
	}

}
