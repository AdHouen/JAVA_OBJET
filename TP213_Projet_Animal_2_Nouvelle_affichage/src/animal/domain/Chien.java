package animal.domain;

public class Chien extends Mammiferes {

	public Chien(String nom) {
		super(nom);

	}

	public Chien() {
		super();

	}

	@Override
	public String toString() {
		//return (getNom()==null?"Je suis un chien .":"Je suis un animal de nom  " + getNom()+ " ." + super.toString() + "je suis un chien");
		return super.toString()+" Je suis un chien";
	}
	
	

}
