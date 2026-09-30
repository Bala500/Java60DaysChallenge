package part2inheritance;
// Single Inheritance 
class Product
{
	String ProductName;
	int ProductId;
	double Price;
	
	Product(String PN,int Pid,double pri)
	{
		this.ProductName=PN;
		this.ProductId=Pid;
		this.Price=pri;
	}
	void displayProduct()
	{
		System.out.println("Product Name :"+ProductName);
		System.out.println("Product ID :"+ProductId);
		System.out.println("Product Price :"+Price);
	}
}
class DigitalProduct extends Product	
{
	double FileSize;
	String FileFormat;
	
	DigitalProduct(String PN,int Pid,double pri,double Fsi,String FF)
	{
		super(PN,Pid,pri);
		this.FileSize=Fsi;
		this.FileFormat=FF;
	}
	void displayDigital()
	{
		System.out.println("Total FileSize :"+FileSize);
		System.out.println("FileFormat :"+FileFormat);
	}
}
class call
{
	public static void main(String[] args) {
		DigitalProduct d1=new DigitalProduct("Java",12,3000,2.2,"PDF");
		d1.displayProduct();
		d1.displayDigital();
	}
}
// End
class Organization
{
	String Organization;
	String Headoffice;
	Organization(String Org,String HF )
	{
		this.Organization=Org;
		this.Headoffice=HF;
	}
	void displayOrganization()
	{
		System.out.println("Name Organization :"+Organization);
		System.out.println("HeadOffice :"+Headoffice);
		
	}
}

class Department extends Organization
{
	String Department;
	int Departmentcode;
	
	Department(String Org,String HF,String Dep,int DC )
	{
		super(Org,HF);
		this.Department=Dep;
		this.Departmentcode=DC;
		
	}
	void displayDepartment()
	{
		System.out.println("Department :"+Department);
		System.out.println("Department Code :"+Departmentcode);
	}
}
class Team extends Department
{
	String TeamName;
	int TeamSize;
	Team(String Org,String HF,String Dep,int DC,String TN,int TS)
	{
		super(Org,HF,Dep,DC);
		this.TeamName=TN;
		this.TeamSize=TS;
	}
	void displayTeam()
	{
		System.out.println("Team Name :"+TeamName);
		System.out.println("Team Size :"+TeamSize);
	}
}
class Call1
{
	public static void main(String[] args) {
		Team T1=new Team("Zoho","Chennai","Testing",2321,"BestTesters",8);
		T1.displayOrganization();
		T1.displayDepartment();
		T1.displayTeam();
	}
}
