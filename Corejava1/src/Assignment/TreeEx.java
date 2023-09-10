package Assignment;

import java.util.*;

public class TreeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();

	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("TreeMap: " + numbers);

	        // Using keySet()
	        System.out.println("Keys: " + numbers.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers.values());
	        
	        numbers.remove("One");
	        System.out.println(numbers);
	    }

	}


