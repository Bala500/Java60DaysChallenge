package part2;
/*public class Blocks {

    static {
        System.out.println("Static block executed");
    }   
    {
    	System.out.println("NOn Static block executed");
    }
    public static void main(String[] args) {
        System.out.println("Main started");
        Blocks obj1 = new Blocks();
        Blocks obj2 = new Blocks();
        System.out.println("Main ended");
    }
}*/

// Program 2

class secound {
	static int x = 10;
	int y = 20;
	// Static Block
	static {
		x = 50;
		System.out.println("X value :" + x);
	}
	// Non Static Block
	{
		x = 100;
		y = 200;
		System.out.println("Block 2 x value:" + x);
		System.out.println("Block 2 y value :" + y);
	}

}

class excution {
	public static void main(String[] args) {
		secound m1 = new secound();
		m1.x = 120;
		m1.y = 220;
		System.out.println("object created value" + m1.x);
		System.out.println("object created value" + m1.y);
		System.out.println(secound.x);
		System.out.println(m1.y);
	}
}