package bookstore.metier;

import java.text.DecimalFormat;

public class Livre {

	public static void main(String[] args) {

		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907, 11.90);

	}

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;
	private boolean prixFixe;

	///////// Constructeur ///////////////////

	public Livre(String unAuteur, String unTitre, int unNbPages, double unPrix) {
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.nbPages = unNbPages;
		this.prix = unPrix;
		this.prixFixe = prix >= 0;

	}

	public Livre(String unAuteur, String unTitre, int unNbPages) {
		this(unAuteur, unTitre, unNbPages, -1);

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

	public boolean isPrixFixe() {
		return prixFixe;
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

		if (this.prixFixe) {
			System.err.println("Prix déjà défini. Changement impossible");

		} else {
			this.prix = prix;
		}

	}

//	public void setPrixFixe(boolean prixFixe) {
//		this.prixFixe = prixFixe;
//	}
// Modification de prixFixe directement après modification du prix.
// Donc pas besoin de creer un SetPrixFixe

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
		DecimalFormat dFormat = new DecimalFormat("00.00€");

		return "L'auteur est : " + this.auteur 
				+ "\nLe titre est : " + this.titre 
				+ "\nLe nombre de page est de : " + this.nbPages 
				+ "\nLe prix est de : " + (this.prix >= 0 ? dFormat.format(this.prix) : "Prix indeterminé");
	}
	
	public int compare(Livre livre) {
		return Integer.compare(this.nbPages - livre.nbPages, 0);
	}
	
	public static int compare2 (Livre livreNumero1, Livre livreNumero2) {
		return Integer.compare(livreNumero1.getNbPages(), livreNumero2.getNbPages()); 
	}
	
	public String methodeAuteurPlusGrosLivre(Livre livre) {
		if (this.compare(livre) < 0) {
			return livre.getAuteur();
			
		}
		if (this.compare(livre) == 0) {
			return "Les deux livres ont le même nombre de page";
			
		}
		return this.getAuteur();
	} 
	
	
	

}
