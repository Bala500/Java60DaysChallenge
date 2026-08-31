package part2;
// Program No : 1
class Engine {
	String EngineNumber;
	String EngineType;

	Engine(String EN, String ET) {
		this.EngineNumber = EN;
		this.EngineType = ET;

	}

	void displayEngine() {
		System.out.println("EngineNumber :" + EngineNumber);
		System.out.println("EngineType :" + EngineType);
	}
}

class Cars {
	String CarName;
	Engine engine;
	

	Cars(String CN, String EN, String ET) {
		this.CarName = CN;
		 engine = new Engine(EN, ET);
	}

	void displayCar() {
		System.out.println("CarName :" + CarName);
		engine.displayEngine();
	}
}

public class Composition {
	public static void main(String[] args) {
		
		Cars c1=new Cars("BMW","FSD3234X23S","Petrol");
		c1.displayCar();
		

	}

	
}
// End

// Program No : 2

class Battery
{
	String Capacity;
	String BatteryType;
	
	Battery(String CC,String BT)
	{
		this.Capacity=CC;
		this.BatteryType=BT;
	}
	void displayBattery()
	{
		System.out.println("Battery Capacity :"+Capacity);
		System.out.println("Battery Type :"+BatteryType);
	}
}
class Mobile
{
	String Brand;
	String Model;
	Battery battery;
	
	Mobile(String MB,String MM,String CC,String BT)
	{
		this.Brand=MB;
		this.Model=MM;	
		battery=new Battery(CC,BT);
	}
	
	void displayMobile()
	{
		System.out.println("Mobile Brand :"+Brand);
		System.out.println("Mobile Model :"+Model);
		battery.displayBattery();
	}
	
}
class Main
{
	public static void main(String[] args) {
		Mobile m1=new Mobile("Oneplus","Onplus 6","3400 mAh","Lithium-ion");
		m1.displayMobile();
	}
}


class Customer
{
	String CusName;
	long Pno;
	
	Customer(String CN,long Pn)
	{
		this.CusName=CN;
		this.Pno=Pn;
	}
	void displayCustomer()
	{
		System.out.println("Customer Name :"+CusName);
		System.out.println("Customer ContactNumber :"+Pno);
	}
}
class BankAccounts
{

	long AccNum;
	double Balance;
	Customer cus;
	
	BankAccounts(String CN,long Pn,long Ac,double bal)
	{
		this.AccNum=Ac;
		this.Balance=bal;
		this.cus=new Customer(CN,Pn);
		
	}
	void displayBA()
	
	{
		cus.displayCustomer();
		System.out.println("Account HolderNumber :"+AccNum);
		System.out.println("Account Balance :"+Balance);
		
	}
	
}
class Operation
{
	public static void main(String []args)
	{
		BankAccounts b1=new BankAccounts("Bala",876523454,34234233,350000);
		b1.displayBA();
	}
}


