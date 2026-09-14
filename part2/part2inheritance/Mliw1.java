package part2inheritance;
//In this Class i WorkOut Multi Inheritance 

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
