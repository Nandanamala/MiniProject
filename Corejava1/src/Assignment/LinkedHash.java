package Assignment;

import java.util.*;
public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        LinkedHashMap<String, Integer> Numbers = new LinkedHashMap<>();
       Numbers.put("Two", 2);
       Numbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + Numbers);
        
        System.out.println("Keys: " + Numbers.keySet());

       
        System.out.println("Values: " + Numbers.values());
    

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(Numbers);
       numbers.put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);
        
        numbers.remove("Two");
        System.out.println(numbers);
        
        System.out.println(numbers.size());
        
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);
        
       // System.out.println(numbers.isEmpty());

        Numbers.clear();
        System.out.println(Numbers);
    }

	}


