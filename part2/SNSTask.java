package part2;
// Employee Company Details
public class SNSTask {
	
	static String company="TATA";
	String empname;
	int empid;
	

	void displayEmployeeDetails()
	{
		System.out.println("------------------------");
		System.out.println("Company Name :"+SNSTask.company);
		System.out.println("Empid :"+empid);
		System.out.println("EmpName :"+empname);
		
	}
	public static void main(String[] args) {
		SNSTask emp1=new SNSTask();
		emp1.empname="Bala";
		emp1.empid=10;
		
		SNSTask emp2=new SNSTask();
		emp2.empname="Jaya";
		emp2.empid=20;
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
	}

}
class SNSTask2
{
	String stuname;
	int stuid;
	static int totalstudent=0;
	
	
	void addstudent()
	{
		System.out.println("Student Name :"+stuname);
		System.out.println("Student ID :"+stuid);
		System.out.println("----------------------");
		totalstudent++;
	}
	static void showTotalStudents()
	{
		
		System.out.println("Present Students :"+totalstudent);
		
	}
	public static void main(String[] args) {
		SNSTask2 stu1=new SNSTask2();
		stu1.stuname="Bala";
		stu1.stuid=01;
		stu1.addstudent();
		
		
		SNSTask2 stu2=new SNSTask2();
		stu2.stuname="Raja";
		stu2.stuid=02;
		stu2.addstudent();
		SNSTask2.showTotalStudents();
	}
	
	 
	
}

// Bank Account System (Non-Static Method)

class SNSTask3
{
	String ahn;
	long AN;
	double bal;
	
	void deposit(double amount)
	{
		bal=bal+amount;
		System.out.println("Deposit Successfully :"+(amount));
	}
	void withdrawal(double amount)
	{
		bal=bal-amount;
		System.out.println("Withdrawal Successfully :"+(amount));
	}
	void checkbalance()
	{
		
		System.out.println("Available Amount :"+(bal));
	}
	
	public static void main(String[] args) {
		SNSTask3 bank=new SNSTask3();
		bank.ahn="Balamurugan";
		bank.AN=883234223432l;
		bank.bal=30000;
		bank.withdrawal(20000);
		bank.checkbalance();
		bank.deposit(50000);
		bank.checkbalance();
	}
}
class SNSTask4
{
	static String Brand="OnePlus";
	double Price=50000d;
	static String Color="Black";
	
	static void brand()
	{
		System.out.println("Mobile Brand :"+Brand);
	}
	  void price()
	{
		System.out.println("Mobile Price :"+Price);
	}
	 static void color()
	 {
		 System.out.println("Mobile Color :"+Color);
	 }
	 
	public static void main(String[] args) {
		SNSTask4 call=new SNSTask4();
		SNSTask4.brand();
		call.price();
		call.color();
		
		
	}
}







































