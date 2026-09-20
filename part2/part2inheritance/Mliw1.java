package part2inheritance;
//In this Class MLIW means (Multi level Inheritance concepts) i WorkOut 

class Company
{
	String companyname;
	String companylocation;
	
	Company(String CN,String CL)
	{
		this.companyname=CN;
		this.companylocation=CL;
	}
	void displayCompany()
	{
		System.out.println("Company Name :"+companyname);
		System.out.println("Compnay Location :"+companylocation);
	}
}
class Employee extends Company
{
	String EmployeeName;
	int Employeeid;
	
	Employee(String CN,String CL,String EN,int EI)
	{
		super(CN,CL);
		this.EmployeeName=EN;
		this.Employeeid=EI;
		
	}
	void displayEmployee()
	{
		
		System.out.println("Employee Name :"+EmployeeName);
		System.out.println("Employee ID :"+Employeeid);
		
	}
}
class developers extends Employee 
{
	String ProgrammingLanguage;
	int Experience;
	
	developers(String CN,String CL, String EN,int EI,String PL,int EP)
	{
		super(CN,CL,EN,EI);
		this.ProgrammingLanguage=PL;
		this.Experience=EP;
		
	}
	void displayDeveloper()
	{
		displayCompany();
		displayEmployee();
		System.out.println("Deverloper Used ProgramminLanguage :"+ProgrammingLanguage);
		System.out.println("Developer WorkExperience :"+Experience);
	}
}

public class Mliw1 {
	public static void main(String[] args) {
		developers d1=new developers("Zoho", "Chennai","Balamurugan", 101,"Java",2);
		d1.displayDeveloper();
	}
	

}
// End of Program No 1


// Program No:2 is Multi-level Inheritance
class vehicle
{
	String Brand;
	String Model;
	
	vehicle(String Ba,String Mo)
	{
		this.Brand=Ba;
		this.Model=Mo;
		
	}
	void displayvehicle()
	{
		System.out.println("Vehicle Brand :"+Brand);
		System.out.println("Vehicle Model :"+Model);
	}
	
	
}
class car extends vehicle
{
	int Door;
	
	car(String Ba,String Mo,int Do)
	{
		super(Ba,Mo);
		this.Door=Do;
	}
	void displaycar()
	{
		System.out.println("No of Door :"+Door);
	}
}
class ElectricCar extends car
{
	int Capacity;
	int km;
	
	ElectricCar(String Ba,String Mo,int Do,int Ca,int Km)
	{
		super(Ba,Mo,Do);
		this.Capacity=Ca;
		this.km=Km;
		
	}
	void displayEV()
	{
	System.out.println("Battery Capacity :"+Capacity);
	System.out.println("Total KM Cover :"+km);
	}
	
}
class Execution
{
	public static void main(String [] args)
	{
		ElectricCar e1=new ElectricCar("TATA", "Nexon EV", 5, 40, 400);
		e1.displayvehicle();
		e1.displaycar();
		e1.displayEV();
	}
}
// End