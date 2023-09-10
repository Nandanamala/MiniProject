package Assignment;

import java.util.Scanner;

public class IncrementandDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n");
		int n = sc.nextInt();
		System.out.println("Pre Icnrement is" +" " + (++n));
		System.out.println("Pre Decrement is" +" "+ (--n));
		System.out.println("Post Decrerement is" +" " +(n--));
		System.out.println("Post Increment is" + " "+ (n++));
	}

}
