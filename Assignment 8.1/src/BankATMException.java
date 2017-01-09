
public class BankATMException extends RuntimeException {
	String exceptionMsg;

	public BankATMException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}
	
	@Override
	public String toString() {
		return "BankATMException [exceptionMsg=" + exceptionMsg + "]";
	}

	
	
}
