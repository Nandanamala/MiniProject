package Assignment;

import java.util.*;

public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Initializing a Map of type HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(8, "eight");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        System.out.println(map);
        
        map.put(2, "two");
        System.out.println(map);
        
        System.out.println("Keys: " + map.keySet());
        
        System.out.println("values: " + map.values());
        
        map.remove(5);
        System.out.println(map.size());
       System.out.println("Removed value: "+map);
System.out.println(map);

    }
}
	
