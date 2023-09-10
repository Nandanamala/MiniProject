package Basic;

public class OverloadingReturnType {

	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(OverloadingReturnType.add(2,3));
System.out.println(OverloadingReturnType.add(2.6,3.7));
System.out.println(OverloadingReturnType.add(7.2,3));
	}

}
