package bookstore.metier;

public class Personne {
	
	private String nom;
	private String prenom;
	
	// Getter
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	// Setter
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	// Constructeur
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne() {
		this("Nom Inconnu", "Prenom Inconnu");
		
		
	}
	@Override
	public String toString() {
		return "Nom : " + nom + "\nPrenom : " + prenom;
	}
	
	// Override
	
	
	
	

}
