package part2inheritance;
// In this class i practice Hybrid Inheritance 
// Program No : 1 
interface Machine
{
	void start();
}

class Engine implements Machine
{
	public void start()
	{
		System.out.println("Engine Start");
	}
	
	void fuel()
	{
		System.out.println("Engine uses fuel");
	}
}
class Cars extends Engine
{
	void drive()
	{
		System.out.println("car is driving");
	}
}

class Sportscar extends Cars
{
	
	void turbo()
	{
		
		System.out.println("SportsCar engages turbo boost.");
	}
}
public class HybInW {
	public static void main(String[] args) {
		Sportscar s1=new Sportscar();
		s1.start();
		s1.fuel();
		s1.drive();
		s1.turbo();
	}
}
// End 

//Program No : 2
interface AutomationSkill
{
	void showskill();
}
class Companys
{
	String CompanyName;
	String Location;
	
	Companys(String CN,String Loc)
	{
		this.CompanyName=CN;
		this.Location=Loc;
		
	}
	
	void displayCompany()
	{
		System.out.println("Company Name :"+CompanyName);
		System.out.println("Company Location :"+Location);
		
	}
}

class Employees1 extends Company
{
	String Empname;
	int  empid;
	double salary;
	
	Employees1(String CN,String Loc,String Emp,int id,double sal)
	{
		super(CN,Loc);
		this.Empname=Emp;
		this.empid=id;
		this.salary=sal;
	}
	void displayEmp()
	{
		System.out.println("Employee Name :"+Empname);
		System.out.println("Employee ID :"+empid);
		System.out.println("Employee Salary"+salary);
	}
	
}
class Developers extends Employees1
{
	String ProgramLanguage;
	int Experience;
	
	Developers(String CN,String Loc,String Emp,int id,double sal,String Pro,int Exp)
	{
		
		super(CN,Loc,Emp,id,sal);
		this.ProgramLanguage=Pro;
		this.Experience=Exp;
	}
	void displayDeveloper()
	{
		System.out.println("Programming Language"+ProgramLanguage);
		System.out.println("Total Experience :"+Experience);
		
	}
	
}
class Tester extends Employees1

{
	String TestingTool;
	int TesterExperience;
	
	Tester(String CN,String Loc,String Emp,int id,double sal,String TT,int TE)
	{
		super(CN,Loc,Emp,id,sal);
		this.TestingTool=TT;
		this.TesterExperience=TE;
	}
	void displayTest()
	{
		System.out.println("Testing Tool :"+TestingTool);
		System.out.println("Test Engineer  Experience :"+TesterExperience);
	}
	void showskill()
	{
		System.out.println("\"Skill                : Automation Testing\"");
	}
	
	
}
class Programs2
{
	public static void main(String[] args) {
		Tester T1=new Tester("Zoho","Chennai","Bala",2,50000,"Selenium",2);
		System.out.println("--------------TestEngineer--------------");
		T1.displayCompany();
		T1.displayEmp();
		T1.displayTest();
		System.out.println("------------Developer-----------------");
		Developers d1=new Developers("HTL","Chennai", "Raja",1,50000,"java",2);
		d1.displayCompany();
		d1.displayEmp();
		d1.displayDeveloper();
	}
}
