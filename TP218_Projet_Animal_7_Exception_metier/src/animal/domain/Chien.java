package animal.domain;

/**
 * @author Adrien
 * Cette classe est pour les chiens 
 *
 */
public class Chien extends Mammifere {

	public Chien(String nom) throws AnimalException {
		super(nom);

	}

	public Chien() {
		super();

	}

	@Override
	public String toString() {
		return getNom()==null?"Je suis un chien .":getNom() + " parle : waouf waouf";
	}

	@Override
	public void parle() {
		System.out.println(getNom() + " parle : waouf waouf ");
	}
	
	

}
