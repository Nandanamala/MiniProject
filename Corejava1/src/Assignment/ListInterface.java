package Assignment;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Yogesh");
		list.add("Nandanamala");
		list.add("Thivya");
		list.add("Shivashankari");
		list.add("Vishalatchi");
		list.remove(3);

		Collections.sort(list);
		for (String Students : list)
			System.out.println(Students);
		//System.out.println(list);

	}

}
