package part2inheritance;
// In This Class I Workout To The Inheritance Concepts

//Program No :1 is Single Inheritance
class WhatsAppV1
{
	void whatsappv1()
	{
		System.out.println("This is Whatsapp Version 1 i Created Whatsapp ");
		
	}
}
class WhatsAppV2 extends WhatsAppV1
{
	void whatsappv2()
	{
		super.whatsappv1();
		System.out.println("This is Whatsapp Version 2 i Created Chat Menu");
		
	}
}

public class Workout1 {
	
	public static void main(String []args)
	{
		WhatsAppV2 w1=new WhatsAppV2();
		
		w1.whatsappv2();
		
	}
	

}





// Program No : 2
class Developer extends Employees
{			
	String ProLan;
	Developer(String name,int empid,double salary,String ProLan)
	{
		
		super(name,empid,salary);
		this.ProLan=ProLan;
		
	}
	void displaydev()
	{
		System.out.println("Programming Language :"+ProLan);
	}
	
}
class Workout2
{
	public static void main(String[] args) {
		Developer d1=new Developer("Raju", 3, 50000, "python");
		d1.displayemp();
		d1.displaydev();
	}
}

