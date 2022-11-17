package animal.domain;

public class Homme extends Mammiferes {

	public Homme() {
		super();
		
	}

	public Homme(String nom) {
		super(nom);
		
	}

	@Override
	public String toString() {
		
		//return (getNom()==null?("Je suis un annimal. Je suis un mammifère. Je suis un homme"):"Je suis un animal de nom  " + getNom()+ " ." + super.toString() + "je suis un homme");
		return super.toString()+" Je suis un homme";
	}

	
	

}
