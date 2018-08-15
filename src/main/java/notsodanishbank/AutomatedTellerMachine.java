package notsodanishbank;

public class AutomatedTellerMachine {
	private int content;
	
	public AutomatedTellerMachine() {
		super();
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
	
	public ResponseObject makeDeposit(Account account, int content) {
		account.deposit(content);
		
		ResponseObject responseObject = new ResponseObject(0, "Deposit successful");
		
		return responseObject;
	}
}
