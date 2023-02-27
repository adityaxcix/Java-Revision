package hashMap_Basics;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hmap2 {

	public static void main(String[] args) {
		HashMap<String, Integer> EmpId = new HashMap<>();

		EmpId.put("Aditya", 1);
		EmpId.put("Mosh", 2);
		EmpId.put("Snowy", 3);
		EmpId.put("Dipika", 4);

		System.out.println(EmpId);
		System.out.println("===========================================================");
		System.out.println(EmpId.get("Aditya"));
		System.out.println("===========================================================");

		System.out.println(EmpId.containsKey("Dipika"));
		System.out.println(EmpId.containsKey("Softy"));
		System.out.println("===========================================================");
		System.out.println(EmpId.containsValue(1));
		System.out.println(EmpId.containsValue(5));
		System.out.println("===========================================================");
		System.out.println(EmpId.replace("Dipika", 7));
		System.out.println(EmpId);

		System.out.println(EmpId.replace("Dipika", 4));
		System.out.println(EmpId);
		System.out.println("===========================================================");

		// Search Operations

		if (EmpId.containsKey("Aditya")) {
			System.out.println("Key is Present in HashMap");
			System.out.println("Key is : "+EmpId.get("Aditya"));
		} else {
			System.out.println("Key is Not Present in HashMap");
		}
		System.out.println("===========================================================");

		if (EmpId.containsValue(1)) {
			System.out.println("Value is Present in HashMap");
			
		} else {
			System.out.println("Value is Not Present in HashMap");

		}
		System.out.println("===========================================================");
		
		//Iteration in HashMap
		
		for(Map.Entry<String, Integer> e: EmpId.entrySet())
		{
			System.out.println (e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println("===========================================================");
		
		//remove pair
		
		EmpId.remove("Mosh");
		System.out.println(EmpId);

		EmpId.replace("Snowy", 2);
		EmpId.replace("Dipika", 3);
		System.out.println(EmpId);
	}

}
