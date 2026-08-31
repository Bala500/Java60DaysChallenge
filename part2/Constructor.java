package part2;

//Start 1 Program
// In this Program i practice constructor concept
public class Constructor {
	
	String clgname;
	int id;
	String dob;
	long phone;
	double per;
	
	Constructor(String clg,int Id,String Dob,long Ph,double Per)
	{
		this.clgname=clg;
		this.id=Id;
		this.dob=Dob;
		this.phone=Ph;
		this.per=Per;
	}
	void Details()
	{
		System.out.println("Collge Name :"+ clgname);
		System.out.println("Student Id :"+ id);
		System.out.println("Student DoB :"+dob);
		System.out.println("Student Contact Number :"+ phone);
		System.out.println("Student Percentage :"+ per);
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor("SMASC",23,"22/2/2003",45675456,32);
		c1.Details();
	}
	

}
// End 2 Program
class Car
{
	int carid;
	String brand;
	String model;
	double price;
	String color;
	boolean status;
	
	Car()
	{
		carid=0;
		brand="Unknown";
		model="Unknown";
		price=0.0;
		color="white";
		status=true;
			
	}
	
	Car(int Carid,String Brand,String Model,double Price)
	{
		this.carid=Carid;
		this.brand=Brand;
		this.model=Model;
		this.price=Price;
		this.color="white";
		this.status=true;
	}
	Car(int Carid,String Brand,String Model,double Price,String Color)
	{
		this.carid=Carid;
		this.brand=Brand;
		this.model=Model;
		this.price=Price;
		this.color=Color;
	}
	Car(int Carid,String Brand,String Model,double Price,String Color,boolean Status)
	{
		this.carid=Carid;
		this.brand=Brand;
		this.model=Model;
		this.price=Price;
		this.color=Color;
		this.status=Status;
	}
	void vechile()
	{
		System.out.println(" CarId :"+carid  +" \n CarBrand :"+brand +" \n CarModel :"+model 
			+"\n CarPrice :"+price +"\n CarColor :"+color+" \n CarStatus :"+status);
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.vechile();
		System.out.println("--------------------------------");
		Car c2=new Car(201, "BMW", "M5", 2000000, "Yellow");
		c2.vechile();
		System.out.println("--------------------------------");
		Car c3=new Car(201, "Mustung", "M5", 5000000, "Black",true);
		c3.vechile();
	}
	

}
//End 3 Program




























 









