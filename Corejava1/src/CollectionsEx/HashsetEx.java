package CollectionsEx;

import java.util.TreeSet;
import java.util.*;
public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> hs=new TreeSet<>();
		hs.add("nandana");
		hs.add("vandana");
		hs.add("chandana");
		System.out.println("Tree set:"+hs);
		System.out.println("****Using Enhanced for loop*******");
		for(String i:hs) {
			System.out.println(i);
		}
		System.out.println("****Using Iterator***********");
		Iterator<String> i = hs.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());

	}
	}


