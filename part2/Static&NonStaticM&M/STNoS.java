package part2;

/*
 * In this class i covered how to declare static member and non static member after 
 * how to apply static method and non static method
 * 
 */
// Exercise and Connect is same program
//Start 
public class STNoS {
	static int a = 10;
	int b = 20;
	static {
		System.out.println("static");
	}
	{
		System.out.println("non Static");
	}

	static void m1() {
		System.out.println("Static Method");
	}

	void m2() {
		System.out.println("Non Static Method");
	}

	public static void main(String[] args) {
		STNoS ex = new STNoS();
		System.out.println(STNoS.a);
		STNoS.m1();
		System.out.println(ex.b);
		ex.m2();

	}
}

class Connect {
	public static void main(String[] args) {
		STNoS c1 = new STNoS();
		System.out.println(c1.b);
		System.out.println(STNoS.a);
		STNoS.m1();
	}
}

// End 1 Program


// Start 2 Program
// In this Program i cover to static method,member and non static method,member ,constructor
class Employee {
	static String CompanyName;
	static int TotalEmp;
	int Id;
	String Empname;
	double Salary;

	Employee(int id, String empname, double salary, String companyname) {
		this.Id = id;
		this.Empname = empname;
		this.Salary = salary;
		this.CompanyName = companyname;
		TotalEmp++;

	}

	void displayDetails() {
		System.out.println("EmpId :" + Id);
		System.out.println("EmpName :" + Empname);
		System.out.println("EmpSalary :" + Salary);
		System.out.println("EmpCompany :" + CompanyName);
	}

	static void showTotalEmployees() {
		System.out.println("Total Employee In " + CompanyName + ":" + TotalEmp);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Balamurugan", 50000, "Infotech");
		Employee e2 = new Employee(2, "Raju", 40000, "Infotech");
		e1.displayDetails();
		System.out.println("---------------------------");
		e2.displayDetails();
		Employee.showTotalEmployees();

	}

}
//End 2 Program

// Start 3 Program
// This is Claude Task Program same 2 program concept
class BankAccount
{
	static String Bn="SBI";
	static double Ir;
	static int Ta;
	long An;
	String Ahn;
	double Bal;
	
	BankAccount(long an,String ahn,double bal)
	{
		this.An=an;
		this.Ahn=ahn;
		this.Bal=bal;
		Ta++;
	}
	void withdrawal(double amount)
	{
		if(amount>Bal)
		{
			Bal+=amount;
			System.out.println("Insuffient Balance");
			
		}
		else
			Bal-=amount;
		System.out.println(amount + " withdrawn from Account No: " + An
                + ", New Balance: " + Bal);
			
	}
	void Details()
	{
		System.out.println("Account Number is :"+An);
		System.out.println("Account Holder is :"+Ahn);
		System.out.println("Account Balance is :"+Bal);
		System.out.println("Bank Name is :"+Bn);
		
	}
	double calculateInterest()
		
	{
		
		 return (Bal*Ir)/100;
		 
		 
	}
	
	static void showTotalAccounts()
	{
		 System.out.println("Total Accounts in " + Bn + ": " + Ta);
	}
	
	static void changeInterestRate(double newRate)
	{
		Ir = newRate;
		System.out.println("Interest rate updated to " + newRate + "% for ALL accounts");
	} 
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(987654323,"Murugan",20000);
		BankAccount b2=new BankAccount(345678765,"Gokul",10000);
		BankAccount b3=new BankAccount(987654323,"Tajuswari",23221);
		b1.Details();
		b1.calculateInterest();
		b1.changeInterestRate(3);
		b1.showTotalAccounts();
		
		
	}

}
// End 3 Program





























































