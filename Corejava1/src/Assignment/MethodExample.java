package Assignment;

public class MethodExample {

	public static void main(String[] args) {

		int a = 19;
		int b = 5;
		int num=4;
	    findEvenOdd(num);
//method calling  
		int c = add(a, b);
		int d = sub(a, b);// a and b are actual parameters
		System.out.println("The Add of a and b is= " + c);
		System.out.println("The Sub of a and b is= " + d);
	}

//user defined method  
	public static int add(int a, int b) 
	{
		int s;
		s = a + b;
		return s; 
	}
	public static int sub(int a, int b) 
	{
		int s;
		s = a - b;
		return s; 
	}
	public static void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  

}
