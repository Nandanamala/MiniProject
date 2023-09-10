package Basic;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 20;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int x = ++a;
		System.out.println("pre increment" +x);
		int y = b;
		System.out.println("post increment" +y);
		int z=+1011;
		int z1=~z;
		System.out.println("invertion" +z1);
		int w=-1011;
		int w2=~w;
		System.out.println("invertion" +w2);

		System.out.println("Addition : " + sum);
		System.out.println("substraction : " + sub);
		System.out.println("multiplication : " + mul);
		int all=8;
        System.out.println("Right shift " +(all>>2));
        System.out.println("left shift " +(all<<2));
	}

}
