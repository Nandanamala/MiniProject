package Java8;

import java.util.Scanner;

interface validate {
	boolean isValid(String firstName, String lastName);
}

public class Source {

	boolean validate(String username,String password)
		{
			validate v=(str1,str2)->{return(str1.equals("ABC") && str2.equals("DEF"))?
					true:false;};return v.isValid(username,password);

	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String uname="Nandu";
		String pass="123";
		Source s=new Source();
		System.out.println(s.validate(uname, pass));
	}

}
