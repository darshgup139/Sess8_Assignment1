
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAtm ba1 = new BankAtm(1, "SBI", "Mumbai");
		System.out.println(ba1);		//Balance = 10k
		ba1.deposit(2000);				//Balance = 10k+2k = 12k
		ba1.withdraw(3000); 			//Balance = 12k-3k = 9k
		BankAtm ba2 = new BankAtm(2, "PNB", "Mumbai");
		System.out.println(ba2);		//Balance = 9k
		ba2.deposit(2000);				//Balance = 9k+2k = 11k
		ba2.withdraw(3000);				//Balance = 11k-3k = 8k
		BankAtm ba3 = new BankAtm(3, "SBI", "Mumbai");
		System.out.println(ba3);		//Balance = 8k
		ba3.deposit(1000);				//Balance = 8k+1k = 9k
		ba3.withdraw(2000);				//Balance = 9k-2k = Exception
	}
}
/*
 ******************************************************************************
Output:
BankAtm [ATM-Id=1, Bank Name=SBI, Location=Mumbai, Balance=10000.0]
BankAtm [ATM-Id=2, Bank Name=PNB, Location=Mumbai, Balance=9000.0]
BankAtm [ATM-Id=3, Bank Name=SBI, Location=Mumbai, Balance=8000.0]
Exception in thread "main" BankATMException [exceptionMsg=Balance is less than 10000.
The withdrawal is not allowed]
	at BankAtm.withdraw(BankAtm.java:25)
	at Run.main(Run.java:17)
 ******************************************************************************
 */
