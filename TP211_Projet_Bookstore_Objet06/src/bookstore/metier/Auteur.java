package bookstore.metier;

public class Auteur extends Personne {

	public Auteur(String nom, String prenom) {
		super(nom, prenom);
		
	}
	
	public Auteur() {
		this("Nom Inconnu", "Prenom Inconnu");
	}

	@Override
	public void parle() {
		System.out.println("Achetez mon livre !");
		
	}

	@Override
	public String toString() {
		return "L'Auteur est  : " + super.toString();
	}
	
	
	
	

}
