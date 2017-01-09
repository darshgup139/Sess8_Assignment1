
public class BankAtm {
	private int atmId;
	private String bankName;
	private String location;
	private static double balance = 10000;

	public BankAtm(int atmId, String bankName, String location) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		BankAtm.balance = balance;
	}

	public void withdraw(double amt) {
		if (balance < 10000)
			throw new BankATMException("Balance is less than 10000.\nThe withdrawal is not allowed");
		else if (amt > balance)
			throw new BankATMException("Invalid Amount: Amount greater than balance");
		else
			balance -= amt;
	}

	public void deposit(double amt) {
		if (amt <= 0)
			System.out.println("Invalid Amont: Amount should be greater than 0");
		else
			balance += amt;
	}

	@Override
	public String toString() {
		return "BankAtm [ATM-Id=" + atmId + ", Bank Name=" + bankName + ", Location=" + location + ", Balance=" + balance
				+ "]";
	}
}
