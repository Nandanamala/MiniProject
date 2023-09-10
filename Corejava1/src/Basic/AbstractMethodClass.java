package Basic;

abstract class vehicle{
	String van;
	String car;
	public vehicle(String a,String b) {
		// TODO Auto-generated constructor stub
		van=a;
		car=b;
	}
	abstract void display() ;
	void change() {
		System.out.println("Abstract method");
	}
}
class Hundai extends vehicle{

	public Hundai(String a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("a+b "+van+" "+car);
	}
	void change() {
		System.out.println("first child class method");
	}
	
}
class Maruthi extends Hundai{

	public Maruthi(String a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("a+b "+car+" "+van);
	}
	void change() {
		super.change();
		System.out.println("Second Subclass method");
	}
}
public class AbstractMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Maruthi m=new Maruthi("toyota", "benz");
				m.display();
				m.change();
				vehicle veh;// declaring a abstract class object and intialize with subclass object through which we can access abstrct method in abstract class 
				veh=m;
				m.display();
				m.change();
				
	}

}
