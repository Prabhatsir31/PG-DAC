package mypack;

public class MyBean 
{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyBean [message=" + message + "]";
	}
	
}
