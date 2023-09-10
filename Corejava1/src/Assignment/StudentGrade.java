package Assignment;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter number n");
int n = sc.nextInt();
if(n>=90)
{
	System.out.println("A");
}
else if(n>=80 && n<=89)
{
	System.out.println("B");
}
else if(n>=70 && n<=79)
{
	System.out.println("C");
}
else if(n>=60 && n<=69)
{
	System.out.println("D");
}
else
{
	System.out.println("F");
}
	}

}
