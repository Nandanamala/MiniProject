package Basic;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Black Bunny Balck Bunny";
String str1="black";
String str11="";
String str2="pink";
System.out.println("Length of the string is:" + str1.length());
System.out.println("Uppercase:" + str.toUppercase());
System.out.println("Lowercase:" + str.toLowercase());
System.out.println("both strings are equal:" + str.equals(str1));
System.out.println("contains method:" + str11.contains(str1));
System.out.println("Concate string:" + str1.concat("cloud"));
System.out.println("Index of string:" + str1.indexof("Bunny"));
System.out.println("replace string:" + str1.replace("black","pink"));
String str4="HOW, ARE, YOU";
String arrStr[]=str4.split(",",3);
System.out.println("splitted elements:");
	}

}
