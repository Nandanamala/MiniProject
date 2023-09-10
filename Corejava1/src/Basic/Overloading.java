package Basic;

public class Overloading {
	void add(int a) {
		System.out.println("sum :" + (a++));
	}

	void add(int a, int b) {
		System.out.println("sum of :" + a + (a + b));
	}

	void add(int a, float b) {
		System.out.println("sum :" + (a + b));
	}

	void add(float a, float b) {
		System.out.println("sum :" + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading c = new Overloading();
		c.add(60);
		c.add(3,8);
		c.add(2, 5.2f);
		c.add(2.5f,3.7f);

	}

}
