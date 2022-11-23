package facto;

public class MathException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public MathException() {
		super("Probleme de calcul");
	}

	public MathException(String message) {
		super(message);
	}

	public MathException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	


}
