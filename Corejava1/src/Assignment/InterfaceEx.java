package Assignment;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Rectangle();  
		d.draw();
	}
}

	interface Drawable{  
		void draw();  
		}  
		//Implementation: by second user  
		class Rectangle implements Drawable
		{  
		public void draw()
		{
			System.out.println("drawing rectangle");
			}  
		}  
		//class Circle implements Drawable
		// {  
	//	public void draw()
	//	{
		//	System.out.println("drawing circle");
	//		}   
	//	} 
 
	
