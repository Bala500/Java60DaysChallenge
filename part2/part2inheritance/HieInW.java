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
