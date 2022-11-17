package bookstore.metier;

public abstract  class Personne implements iBavard {

	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Le NOM de la personne est : " + nom + "\nLe PRENOM de la personne est : " + prenom;
	}

//	@Override
//	abstract public void parle();
	
	

}
