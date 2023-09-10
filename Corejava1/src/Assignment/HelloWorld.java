package Assignment;

import java.util.*;

class Student1 {
	 String dob, mobileno, name, address;
	 int rollno;
	 public Student1(int rollno,String dob, String name, String address, String mobileno) 
	 {
	 this.rollno=rollno;
    this.dob = dob;
	 this.name = name;
	 this.address = address;
	 this.mobileno = mobileno;
	 }
}

class Sortbyroll implements Comparator<Student1>
{
	public int compare(Student1 a, Student1 b){
		return a.rollno - b.rollno;
	}
}




public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> list = new ArrayList<Student1>();
		Student1 a1 = new Student1(001,"1999-02-20", "Yogesh", "Tamil Nadu", "8974579887");
		Student1 a2 = new Student1(005,"01-30-1999", "Nandanamala", "Karnataka", "9380634864");
		Student1 a3 = new Student1(002,"03-26-1997", "Thivya", "Tamil Nadu", "6748738779");
		Student1 a4 = new Student1(004,"08-23-2000", "Shivashankari", "Tamil Nadu", "6748938779");
		Student1 a5 = new Student1(003,"08-23-2000","Vishalatchi","Tamil Nadu","6748938779");
		 list.add(a1);
		 list.add(a2);
		 list.add(a3);
		 list.add(a4);
		 list.add(a5);
		 System.out.println("List before sorting....");
		 for (Student1 a : list) {
			 System.out.println(a.rollno +" "+ a.dob + " " + a.name + " " + a.address + " " + a.mobileno);
		 }
		 
		 Collections.sort(list,new Sortbyroll());
			//traversing list
			 System.out.println();
			 System.out.println("List after sorting....");
			 for (Student1 a : list) {
			 System.out.println(a.rollno +" "+ a.dob + " " + a.name + " " + a.address + " " + a.mobileno);
	     }
			 
		 list.remove(4);
		 System.out.println();
		 System.out.println("List after removing 4th record....");
		 for (Student1 a : list) {
			 System.out.println(a.rollno +" "+ a.dob + " " + a.name + " " + a.address + " " + a.mobileno);
		 }
		 
		 System.out.println();
		 System.out.println("List after clearing all records....");
		 list.clear();
		 System.out.println(list);
		}
	



	}


