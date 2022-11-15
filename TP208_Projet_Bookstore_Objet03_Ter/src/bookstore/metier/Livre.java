package bookstore.metier;


import java.text.DecimalFormat;
import java.util.Objects;

public class Livre {

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;
	private boolean prixFixe;
	// Question 3 //
//	static private Comptable comptable = new Comptable();
	// Question 4 Singleton //
	private static Comptable comptable = Comptable.getInstance();

	///////// Constructeur ///////////////////

	public Livre(String unAuteur, String unTitre, int unNbPages, double unPrix) {
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.nbPages = unNbPages;
		this.prix = unPrix;
//		this.prixFixe = prix >= 0;
		comptable.comptabilise(this);

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

		this.prix = prix;
		comptable.comptabilise(this);

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
	
	
	///// PROJET TP OBJET 3 /////
	
	static public double getTotalPrix() {
		return comptable.getTotalPrix();
	}

	
	// TP  OBJET 3 TER //
	@Override
	public int hashCode() {
		return Objects.hash(nbPages);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return nbPages == other.nbPages;
	}
	
	
	
	
	
	
	

}
