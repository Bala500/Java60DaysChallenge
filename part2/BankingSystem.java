package part2;

public class BankingSystem {
	static String bankname="HDFC";
	static {
		System.out.println("Hello User");
	}
	
	{
		System.out.println("Your Want to Exit  ");
	}
	static void  bank()
	{
		System.out.println("Deposit Successfull");
	}
	 void end()
	 {
		 System.out.println("Thank You for visiting Bank ");
	 }
	 public static void main(String[] args) {
		System.out.println(BankingSystem.bankname);
		BankingSystem.bank();
		BankingSystem b1=new BankingSystem();
		
		b1.end();
		
		
	}
	
	
	
	
}
