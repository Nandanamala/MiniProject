package CollectionsEx;

import java.util.*;


public class LinkedList1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l1=new LinkedList<>();
l1.add(10);
l1.addFirst(23);
l1.add(6);
l1.addLast(40);
System.out.println("Element in Linked List:" +l1);
l1.removeLast();
System.out.println("Element in Linked List:" +l1);
Stack<Integer> s=new Stack<>();
s.push(10);
s.push(12);
s.push(4);
System.out.println("My elements:" +s);
System.out.println(s.peek());
System.out.println(s.isEmpty());
	}

}
