package CollectionsEx;

class Student {
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	void display()
	{
		System.out.println("Id :"+id+"name : "+name);
	}
}
public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.setId(1).setName("nandana").display();
//Student student = new Student();
	}

}
