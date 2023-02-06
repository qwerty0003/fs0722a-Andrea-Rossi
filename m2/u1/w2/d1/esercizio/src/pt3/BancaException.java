package pt3;

public class BancaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public BancaException(String str) {
		super();
		this.message = str;
	}

	@Override
	public String toString() {
		return message;
	}
}
