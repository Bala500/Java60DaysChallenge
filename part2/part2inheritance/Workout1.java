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
