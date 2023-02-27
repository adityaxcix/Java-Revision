package hashMap_Basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap<>();
		hm.put(1, "Aditya");
		hm.put(2, "Renu");
		hm.put(3, "Saloni");
		hm.put(4, "Snowy");
		System.out.println(hm);
		System.out.println("------------------------------------------");
		
		
		Set s =hm.keySet(); //To get keys from map
		System.out.println("Keys : "+s);
		System.out.println("------------------------------------------");
		
		Collection c= hm.values(); //To get Values from Map
		System.out.println("Values : "+c);
		System.out.println("------------------------------------------");
		
		
		
		
		
		
		
		
	}

}
