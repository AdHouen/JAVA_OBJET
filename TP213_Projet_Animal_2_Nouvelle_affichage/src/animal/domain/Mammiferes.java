package animal.domain;

public class Mammiferes extends Animal {

	public Mammiferes() {
		super();
		
	}

	public Mammiferes(String nom) {
		super(nom);
		
	}

	@Override
	public String toString() {
		//return (getNom()==null?"":" Je suis un mamifere. ");
		return super.toString()+" Je suis un mamifere.";
	}
	
	
	
	

}
