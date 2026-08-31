package part2;
/*
 * In the class how the person call static member and non static member.
 * How you create the object call another class function and function member i work-outed.
 */
// start
public class Object {
	
	static int a=10; // static member 
	int b=20; // non-static member
	
	static void m1() // static method 
	{
		System.out.println("Hi I Am Static Method");
	}
	void m2() // non static method
	{
		System.out.println("Hi I Am Non-Static Method");
	}
	

}
class sample
{
public static void main(String[] args) {
	Object call=new Object(); // Object Created for Access the Class Member and properties
	System.out.println(call.a);
	System.out.println(call.b);
	call.m1();// Static Method for Object class
	call.m2();// Non Static Method for Object Class
	
}

}
// end

//start
class marker
{
	int length=8;
	static double price=35;
	String brand="Camlin";
	static String shape="Cylindrical";
	String color="Blue";
	
	static void write()
	{
		System.out.println("Marker is used to write");
	}
	void draw()
	{
		System.out.println("Marker is used to Write");
	}
	public static void main(String []args)
	{
		  //static member
		System.out.println("Marker Price :"+marker.price);
		System.out.println("Marker Shape :"+marker.shape);
		marker.write();
		 //Non-static member
		System.out.println("Marker length :"+new marker().length);
		System.out.println("Marker Brand :"+new marker().brand);
		System.out.println("Marker Color :"+ new marker().color);
	}
}
//end

//start
class watch
{
	static String brand="Sonata";
	double price=3200;
	static String color="Black";
	
	static void Watch()
	{
		System.out.println("Watch Brand is :"+watch.brand);
	}
	void detail()
	{
		System.out.println("watch Price is :"+new watch().price);
	}
	static void col()
	{
		System.out.println("Watch color is :"+watch.color);
	}
	public static void main(String [] args)
	{
		watch w1=new watch();
		watch.Watch();
		w1.detail();
		watch.col();
		
	}
}



