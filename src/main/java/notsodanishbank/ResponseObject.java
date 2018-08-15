package notsodanishbank;

public class ResponseObject {
	private int responseCode;
	private String responseMessage;
	
	public int getResponseCode() {
		return responseCode;
	}
	public ResponseObject(int responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
