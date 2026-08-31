package part2.constructorTask;

public class Task1 {
	String name;
	int idnum;
	String Class;
	String dob;
	long ph;
	double per;
	
	Task1(String name,int idnum,String Class,String dob, long ph, double per)
	{
		this.name=name;
		this.idnum=idnum;
		this.Class=Class;
		this.dob=dob;
		this.ph=ph;
		this.per=per;
	}
	void display()
	{
		System.out.println("Student Name is :"+name);
		System.out.println("Student id :"+idnum);
		System.out.println("Student DOB :"+dob);
		System.out.println("Student Parent num :"+ph);
		System.out.println("Student Percentage :"+per);
	}
	public static void main(String [] args)
	{
		Task1 arg=new Task1("Bala",20,"A Section","11/02/2000",123456767,98.83);
		arg.display();
		System.out.println("--------------------------------");
		arg.display();
	}

}
