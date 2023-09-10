package Java8;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		String b = Integer.toBinaryString(a);
		System.out.println(b);

		String c = Integer.toOctalString(a);
		System.out.println(c);

		String d = Integer.toHexString(a);
		System.out.println(d);
	}

}
