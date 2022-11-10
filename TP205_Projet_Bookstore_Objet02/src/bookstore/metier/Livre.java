package bookstore.metier;

public class Livre {

	public static void main(String[] args) {

		Livre monLivre1 = new Livre("George Orwell", "1984", 310);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907);




	}

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;

	///////// Constructeur ///////////////////

	public Livre(String unAuteur, String unTitre, int unNbPages, double unPrix) {
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.nbPages = unNbPages;
		this.setPrix(unPrix);

	}

	public Livre(String unAuteur, String unTitre) {
		this.auteur = unAuteur;
		this.titre = unTitre;

	}

	public Livre() {

	}

	///////// Accesseur //////////////////////

	public String getAuteur() {
		return auteur;
	}

	public String getTitre() {
		return titre;
	}

	public int getNbPages() {
		return nbPages;
	}
	
	public double getPrix() {
		return prix;
	}

	///////// Mutateur //////////////////////

	public void setNbPages(int nbPages) {
		if (nbPages < 0) {
			throw new IllegalArgumentException("Le nombre de page doit être positif");
		}
		this.nbPages = nbPages;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	///////// Methode Affiche Toi //////////////////////

	public void afficheToi() {

//		System.out.println("L'auteur est : " + this.auteur + "\nLe titre est : " + this.titre + "\nLe nombre de page est de : " + this.nbPages);
		System.out.println(this);

	}
	
	

	///// Methode toString() //////////////////////
	// Grace à cette methode on peut utiliser le System.out.println(monLivre1);
	///// puisque un println fait un toString();

	@Override
	public String toString() {
		return "L'auteur est : " + this.auteur + "\nLe titre est : " + this.titre + "\nLe nombre de page est de : "
				+ this.nbPages;
	}

	

	

}
