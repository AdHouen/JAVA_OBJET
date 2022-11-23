package animal.domain;

public class AnimalException extends Exception {

	private static final long serialVersionUID = 1L;

	public AnimalException() {
		super("Erreur : Animal Exception");
	}

	public AnimalException(String message) {
		super(message);
		
	}

	

	public AnimalException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		System.out.println(new AnimalException("Animal inconnu"));
		System.out.println(new AnimalException());
	}

}
