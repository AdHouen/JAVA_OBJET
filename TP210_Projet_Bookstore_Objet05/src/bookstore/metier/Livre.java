package bookstore.metier;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Livre implements Comparable<Livre> {

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;
	private boolean prixFixe;
	private boolean disponible;
	private EnumStatusLivre statusDuLivre;
	private LocalDateTime dateAchat = LocalDateTime.now();
	private static DateTimeFormatter dtf;

	private TypeDeDonnee anneeParution;

	///////// Constructeur ///////////////////

	public Livre(String auteur, String titre, int nbPages, double prix, LocalDateTime dateAchat, TypeDeDonnee anneeParution) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
		this.prix = prix;
		this.prixFixe = prix >= 0;
		this.dateAchat = dateAchat;
		this.setDisponible(true);
		this.statusDuLivre = EnumStatusLivre.DISPONIBLE;
		this.anneeParution = anneeParution;
		dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy à HH:mm:ss");

	}

	public Livre(String auteur, String titre, int nbPages, LocalDateTime dateAchat) {
		this(auteur, titre, nbPages, -1, dateAchat, new TypeDeDonnee(0));
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

	public LocalDateTime getDateAchat() {
		return dateAchat;
	}

	public boolean isPrixFixe() {
		return prixFixe;
	}

	public boolean isDisponible() {

		return disponible;
	}

	public TypeDeDonnee getAnneeParution() {
		
		return anneeParution;
	}

	public EnumStatusLivre getStatusDuLivre() {
		return statusDuLivre;
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

	public void setDateAchat(LocalDateTime dateAchat) {
		this.dateAchat = dateAchat;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

//	public void setPrixFixe(boolean prixFixe) {
//		this.prixFixe = prixFixe;
//	}
// Modification de prixFixe directement après modification du prix.
// Donc pas besoin de creer un SetPrixFixe

	public void setStatusDuLivre(EnumStatusLivre status) {
		this.statusDuLivre = status;
	}

	public void setAnneeParution(TypeDeDonnee anneeParution) {
		this.anneeParution = anneeParution;
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
				+ "\nLe prix est de : " + (this.prix >= 0 ? dFormat.format(this.prix) : "Prix indeterminé")
				+ "\nL'annee de parution est : " + this.anneeParution.getAnnee()
				+ "\nLe status du livre est : " + this.statusDuLivre.getStatut();
				
				
	}

	public int compare(Livre livre) {
		return Integer.compare(this.nbPages - livre.nbPages, 0);
	}

	public static int compare2(Livre livreNumero1, Livre livreNumero2) {
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

	@Override
	public int compareTo(Livre livre) {
		return livre.nbPages - this.nbPages;

	}

}
