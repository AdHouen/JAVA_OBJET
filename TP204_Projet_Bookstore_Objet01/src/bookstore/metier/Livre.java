package bookstore.metier;

public class Livre {

	public static void main(String[] args) {

		Livre monLivre1 = new Livre("George Orwell", "1984", 310);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907);

		System.out.println("L'auteur du Livre 1 est : " + monLivre1.getAuteur());
		System.out.println("L'auteur du Livre 2 est : " + monLivre2.getAuteur());
		System.out.println();
		System.out.println("Le nombre de page du Livre 1 est de : " + monLivre1.getNbPages() + " pages");
		System.out.println("Le nombre de page du Livre 2 est de : " + monLivre2.getNbPages() + " pages");
		System.out.println();
		System.out.println(
				"Le nombre total de page des 2 livres est de : " + (monLivre1.getNbPages() + monLivre2.getNbPages()));

		/////// QUESTION 5 //////////////

//      Livre livre = new Livre();
//      livre.setAuteur("Victor Hugo");
//      livre.setTitre("Les récits de ma fontaine");
//      livre.setNbPages(90);
//      System.out.println(livre);
//		Si on enlève tous les constructeurs, les propriétés seront vides. Alors on instancie avec les set
//		Si on remet le constructeur ça ne fonctionne plus car on y demande de remplir des propriétés

	}

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;

	///////// Constructeur ///////////////////

	public Livre(String unAuteur, String unTitre, int unNbPages) {
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.nbPages = unNbPages;

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
