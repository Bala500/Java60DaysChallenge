package part2.compositiontask;


class Enginees
{
	int Capacity;
	Enginees(int cc)
	{
		this.Capacity=cc;
		
	}
}
class Bike
{
	String name;
	Enginees e1;
	Bike(String na,Enginees e1)
	{
		this.name=na;
		this.e1=e1;
		
	}
}
public class StaNonStaCompodition {
	
	public static void main(String[] args) {
		Bike b1=new Bike("TVS",new Enginees(220));
		System.out.println("Bike Name :"+b1.name);
		System.out.println("Bike Engine :"+b1.e1.Capacity);
	}
	

}
