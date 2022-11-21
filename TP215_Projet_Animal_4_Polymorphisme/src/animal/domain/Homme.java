package animal.domain;

/**
 * @author Adrien
 * Cette classe est pour les Hommes
 */
public class Homme extends Mammifere {

	public Homme() {
		super();
		
	}

	public Homme(String nom) {
		super(nom);
		
	}

	@Override
	public String toString() {
		
		return getNom()==null?"Je suis un homme .":getNom() + "parle : Vive le polymorphisme !";
	}
	
	@Override
	public void parle() {
		System.out.println(getNom() + " parle : Vive le polymorphisme ");
	}
	

	
	

}
