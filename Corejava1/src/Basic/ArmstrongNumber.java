package Basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,r,sum=0,temp;
Scanner sc = new Scanner(System.in);
System.out.println("enter number to check Armsrong: ");
n=sc.nextInt();
temp=n;
while(n>0)
{
	r=n%10;
	sum=sum+(r*r*r);
	n/=10;
}
if(temp==sum)
{
	System.out.println("Number is Armstrong!!");
}
else
{
	System.out.println("Number is not Armstrong!!");
}
	}

}
