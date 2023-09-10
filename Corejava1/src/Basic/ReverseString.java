package Basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Java programming";
String reversed="";
for(int i = s.length()-1;i>=0;i--)
{
	reversed=reversed+s.charAt(i);
}
System.out.println("Reversed string: "+reversed);
	}

}
