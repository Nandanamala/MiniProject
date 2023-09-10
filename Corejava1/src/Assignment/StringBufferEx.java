package Assignment;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer("welcome");
        sb.append("Hello");
        sb.append("");
        sb.append("world");
        sb.insert(0,"language");
       sb.replace(1, 5, "water");
      sb.delete(1, 5);
      sb.reverse();
      int n = sb.length();
    
        System.out.println("length of the string=" +n);
       System.out.println(sb);
	}

}
