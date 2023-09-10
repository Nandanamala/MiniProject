package Assignment;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=4;
     findEvenOdd(num);  //method calling
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
