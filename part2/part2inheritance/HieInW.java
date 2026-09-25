package part2inheritance;


//Program No :1 is Hierarchical -Level  Inheritance
// Start 
class Hospital
{

	String HospitalName;
	String Location;
	
	Hospital(String HN,String loc)
	{
		this.HospitalName=HN;
		this.Location=loc;
	}
	void displayHospital()
	{
		System.out.println("Hospital Name :"+HospitalName);
		System.out.println("Hospital Location :"+Location);
	}
	
}

class Doctor extends Hospital
{
	String Specialization;
	int Experience;
	Doctor(String HN,String loc, String Spe,int Exp)
	{
		super(HN,loc);
		this.Specialization=Spe;
		this.Experience=Exp;
		
	}
	void displayDoctor()
	{
		System.out.println("Specialization :"+Specialization);
		System.out.println("Year of Experience :"+Experience);
	}
	
}
class Nurse extends Hospital
{
	String Department;
	String Shift;
	Nurse(String HN,String loc,String Dep,String Shi)
	{
		super(HN, loc);
		this.Department=Dep;
		this.Shift=Shi;
	}
	void displayNurse()
	{
		System.out.println("Department :"+Department);
		System.out.println("Shift :"+Shift);
	}
		
}

public class HieInW {
	public static void main(String [] args)
	{
			// Hospital & Doctor Class Function
			System.out.println("-----------Doctor-------------");
			Doctor d1 =new Doctor("Apollo","Chennai","Cardiology",8);
			d1.displayHospital();
			d1.displayDoctor();
			// Hospital & Nurse Class Function 
			System.out.println("-----------Nurse----------------");
			Nurse n1 =new Nurse ("Apollo","Chennai","Emergency","Day");
			n1.displayHospital();
			n1.displayNurse();

			
	}
}
// End
// Program No: 2
//start
class Vehicle
{
	String Brand;
	int  Speed;
	
	Vehicle(String Br,int Sp)
	{
		this.Brand=Br;
		this.Speed=Sp;
	}
	void displayInfo()
	{
		System.out.println("Brand : "+Brand);
		System.out.println("Speed : "+Speed);
		
	}
	
}
class Car extends Vehicle
{
	int Doors;
	
	Car(String Br,int Sp,int Dor)
	{
		super(Br,Sp);
		this.Doors=Dor;
	}
	
	void displayDrive()
	{
		System.out.println(Brand+"car is driving with :"+Doors);
		
	}
}
class Bike extends Vehicle
{
	String Type;
	Bike(String Br,int Sp,String Ty)
	{
		super(Br,Sp);
		this.Type=Ty;
	}
	void displayRide()
	{
		System.out.println(Brand+" is a "+Type+" Bike");
	}
}
class Truck extends Vehicle
{
	int LoadCapacity;
	
	Truck(String Br,int Sp,int LD)
	{
		super(Br,Sp);
		this.LoadCapacity=LD;
		
	}
	void discarryLoad()
	{
		System.out.println("Tata truck is carrying a load of "+LoadCapacity);
	}
}
class Program2
{
	public static void main(String [] args)
	{
		Car c1=new Car("Toyota", 180, 4);
		Bike b1=new Bike("Pulsar",110,"Sports");
		Truck t1=new Truck("Tata",80,50);
		//car Functions call
		c1.displayInfo();
		c1.displayDrive();
		//Bike Function Call
		b1.displayInfo();
		b1.displayRide();
		//Truck Function Call
		t1.displayInfo();
		t1.discarryLoad();
		
	}
}
// End
