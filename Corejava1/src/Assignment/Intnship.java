package Assignment;

import java.util.*;

class person {
	String dob,mobileno,name,address;  
	   
	public person(String dob, String name, String address, String mobileno) {  
	    this.dob = dob;  
	    this.name = name;  
	    this.address = address;   
	    this.mobileno = mobileno;  
	}
	
}

public class Intnship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person p1 = new person("1999-02-20","Yogesh","Tamil Nadu","8974579887");
person p2 = new person("01-30-1999","Nandanamala","Karnataka","9380634864");
person p3 = new person("03-26-1997","Thivya","Tamil Nadu","6748738779");
person p4 = new person("08-23-2000","Shivashankari","Tamil Nadu","6748938779");
ArrayList<person> names = new ArrayList<person>();

names.add(p1);
names.add(p2);
names.add(p3);
names.add(p4);

System.out.println(names.get(0).name);
System.out.println(names.get(0).address);
System.out.println(names.get(0).dob);
System.out.println(names.get(0).mobileno);

System.out.println(names.get(1).name);
System.out.println(names.get(1).address);
System.out.println(names.get(1).dob);
System.out.println(names.get(1).mobileno);

System.out.println(names.get(2).name);
System.out.println(names.get(2).address);
System.out.println(names.get(2).dob);
System.out.println(names.get(2).mobileno);

System.out.println(names.get(3).name);
System.out.println(names.get(3).address);
System.out.println(names.get(3).dob);
System.out.println(names.get(3).mobileno);

names.remove(2);


System.out.println(names);
	}

}
