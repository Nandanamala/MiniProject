package Assignment;

import java.util.ListIterator;
import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();
a1.add("Indu");
a1.add("Nandu");
a1.add("Megha");
a1.add("Nandana");
ListIterator<String> itr=a1.listIterator();
System.out.println("Traversing elements in forward direction");
while(itr.hasNext())
{
	System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
}
System.out.println("Traversing elements in backward direction");
while(itr.hasPrevious())
{
	System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
}
	}

}

