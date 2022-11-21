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
		
		return getNom()==null?"Je suis un homme .":"Je suis un homme de nom " + getNom();
	}

	
	

}
