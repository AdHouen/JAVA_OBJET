package animal.domain;

import java.io.Serializable;

/**
 * @author Adrien
 * Cette classe est pour les Mammiferes 
 */
abstract public class Mammifere extends Animal implements Serializable {


	public Mammifere() {
		super();
		
	}

	public Mammifere(String nom) {
		super(nom);
		
	}
	
	

	

}
