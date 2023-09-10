package Assignment;

public class UserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedExample obj = new UserDefinedExample();  
		//invoking instance method   
		System.out.println("The sum is: "+obj.add(12, 13));  
		}  
		int s;  
		//user-defined method because we have not used static keyword  
		public int add(int a, int b)  
		{  
		s = a+b;  
		//returning the sum  
		return s;  
	}

}
