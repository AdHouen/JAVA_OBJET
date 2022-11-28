package bookstore.metier;

public class BiblioException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public BiblioException() {
		super("Mega Giga Erreur");
		
	}

	public BiblioException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public BiblioException(String message) {
		super(message);
	
	}

	public BiblioException(Throwable cause) {
		super(cause);
		
	}


}
