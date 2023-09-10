package Assignment;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("Welcome");
		sb.append(" ");
		sb.append("Java");//now original string is changed  
		sb.insert(10," Programming");
		sb.replace(1, 5, "water");
	      sb.delete(1, 5);
	     sb.reverse();
	      int n = sb.length();
	    
	       System.out.println("length of the string=" +n);
	        System.out.println(sb);
		System.out.println(sb);//prints Hello Java  
		 
	}

}
