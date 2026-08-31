package part2;

public class ConstructorOvl {
	String name;
	int id;
	double sal;
	String dep;
	
	ConstructorOvl(String na)
	{
		this.name=na;
	}
	ConstructorOvl(String na,int id)
	{
		this.name=na;
		this.id=id;
	}
	ConstructorOvl(String na,int id,double sal,String dep)
	{
		this.name=na;
		this.id=id;
		this.sal=sal;
		this.dep=dep;
	}
	void emp()
	{
		System.out.println("Employee Name :"+name+"\n"+"Employee Id :"+id+"\n"+"Employee Salary :"+sal+
				"\n"+"Employee Department :"+dep+"\n");
	}
	public static void main(String[] args) {
		ConstructorOvl co1=new ConstructorOvl("Balamurugan");
		co1.emp();
		System.out.println("--------------------------");
		ConstructorOvl co2=new ConstructorOvl("murugan",201);
		co2.emp();
		System.out.println("--------------------------");
		ConstructorOvl co3=new ConstructorOvl("Balamurugan",213,50000,"Testing");
		co3.emp();
	}
	

}

class Employees {

    String name;
    int id;
    double salary;
    String department;

    // Constructor 1 - Name only
    Employees(String name) {
        this.name = name;
    }

    // Constructor 2 - Name and ID
    Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor 3 - All details
    Employees(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    void displayDetails() {

        System.out.println("Employee Name: " + name);

        if (id != 0) {
            System.out.println("Employee ID: " + id);
        }

        if (salary != 0) {
            System.out.println("Salary: " + salary);
        }

        if (department != null) {
            System.out.println("Department: " + department);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Employees e1 = new Employees("Balamurugan");

        Employees e2 = new Employees("Arun", 101);

        Employees e3 = new Employees("Kumar", 102, 25000, "Testing");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}


