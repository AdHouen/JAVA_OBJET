package bookstore.metier;


import java.text.DecimalFormat;


import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


public class Livre {

	

	///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;
	private boolean prixFixe;
	private boolean disponible;
	private LocalDateTime dateAchat = LocalDateTime.now();
	
	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' hh:mm:ss");
	

	///////// Constructeur ///////////////////

	public Livre(String unAuteur, String unTitre, int unNbPages, double unPrix, LocalDateTime dateAchat) {
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.nbPages = unNbPages;
		this.prix = unPrix;
		this.prixFixe = prix >= 0;
		this.disponible = true;
		this.dateAchat = dateAchat;
		
		

	}

	public Livre(String unAuteur, String unTitre, int unNbPages, LocalDateTime dateAchat) {
		this(unAuteur, unTitre, unNbPages, -1, null);

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
	
	public LocalDateTime getDateAchat() {
		return dateAchat;
	}
	
	public boolean isDisponible() {
		return disponible;
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
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public void setDateAchat(LocalDateTime dateAchat) {
		this.dateAchat = dateAchat;
	}



	///////// Methode Affiche Toi //////////////////////

	public void afficheToi() {

		System.out.println(this);

	}


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
