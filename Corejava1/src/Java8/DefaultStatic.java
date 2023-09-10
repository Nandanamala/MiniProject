package Java8;

interface MyInter1 {
	void msg();

	default void display() {
		System.out.println("Default Method Of Interface");
	}
}

public class DefaultStatic implements MyInter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DefaultMethodEx d=new DefaultMethodEx();
		DefaultStatic d = new DefaultStatic();
		d.msg();
		d.display();

	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("My Abstaract Method");

	}

}
