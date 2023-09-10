package Assignment;

import java.util.*;


public class Intns {
  
			  
			String dob,mobileno,name,address;  
			   
			public Intns(String dob, String name, String address, String mobileno) {  
			    this.dob = dob;  
			    this.name = name;  
			    this.address = address;   
			    this.mobileno = mobileno;  
			
			
			}  
			public class ExList {  
			public static void main(String[] args) {  
			   
			    List<Intns> list=new ArrayList<Intns>();  
			    
			    Intns b1=new Intns("1999-02-20","Yogesh","Tamil Nadu","8974579887");  
			    Intns b2=new Intns("01-30-1999","Nandanamala","Karnataka","9380634864");  
			    Intns b3=new Intns("03-26-1997","Thivya","Tamil Nadu","6748738779");  
			   
			    list.add(b1);  
			    list.add(b2);  
			    list.add(b3);  
			    list.clear();
			    for(Intns b:list){  
			    System.out.println(b.dob+" "+b.name+" "+b.address+" "+b.mobileno);  

				//Collections.sort(list);
				
					System.out.println();

			    }  
			  
			}  

			}
}
