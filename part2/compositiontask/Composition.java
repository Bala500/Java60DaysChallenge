package part2.compositiontask;

/*class brand1
{
	String brand="Oneplus";
}
class brand2
{
	String brand="Oppo";
}
class mobile
{
	static brand1 b1=new brand1();
	brand2 b2=new brand2();
}
public class Composition {
	public static void main(String[] args) {
		mobile m1=new mobile();
		System.out.println("Mobile Name :"+m1.b1.brand);
		System.out.println("Mobile Name :"+m1.b2.brand);
		System.out.println(mobile.b1.brand);
	}
	
}
*/

class monitor {
	public static Object m1;
	String os = "window 11";

	void display() {
		System.out.println("use to display");
	}

}

class keyboard {
	int key = 42;

	void type() {
		System.out.println("use to type");
	}
}

class computer {
	static monitor m1 = new monitor();
	keyboard k1 = new keyboard();

}

class Main {
	public static void main(String[] args) {
		System.out.println(computer.m1.os);
		computer.m1.display();
		computer c1 = new computer();
		System.out.println(c1.k1.key);
		c1.k1.type();

	}
}

class Engine {
	int engnum = 1323432;
	String ft = "Diesel";

	void engine() {
		System.out.println("Engine Number is :" + engnum);
		System.out.println("Vehicle Type :" + ft);
	}
}

class car {
		String car = "BMW";
		String model = "M5";

		void cars() {
			System.out.println("The car Name is :" + car);
			System.out.println("The car Model is :" + model);
		}
}

class funtion {
			Engine eng = new Engine();
			car call = new car();
}
class all
{
	public static void main(String[] args) {
		funtion fun=new funtion();
		fun.eng.engine();
		fun.call.cars();
		
	}
}


	