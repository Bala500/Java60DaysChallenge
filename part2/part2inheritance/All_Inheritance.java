package part2inheritance;


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
public class All_Inheritance {


}
