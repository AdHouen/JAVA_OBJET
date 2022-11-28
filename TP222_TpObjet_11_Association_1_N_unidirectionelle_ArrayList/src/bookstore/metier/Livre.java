package bookstore.metier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Livre {

///////// Variable ///////////////////////
	private String titre;
	private String auteur;
	private int nbPages;
	
	private double prix;

	private EnumStatusLivre status;
	private LocalDate dateEmprunt = LocalDate.now();
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private boolean disponible;
	
	
	
	// Getter
	
	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public double getPrix() {
		return prix;
	}

	public EnumStatusLivre getStatus() {
		return status;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public boolean isDisponible() {
		return disponible;
	}
	
	// Setter 
	
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setNbPages(int nbPages) {
		if(nbPages < 0)
			throw new IllegalArgumentException("Nombre de pages doit être positif");
		else
			this.nbPages = nbPages;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setStatusDuLivre(EnumStatusLivre status) {
		this.status = status;
	}

	public void setDateEmprunt(LocalDate localDate) {
		this.dateEmprunt = localDate;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	

	

	// Constructeur
	
	public Livre(String auteur, String titre, int nbPages, double prix, LocalDate dateEmprunt, boolean diponible) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
		this.prix = prix;
		this.dateEmprunt = dateEmprunt;
		this.setDisponible(true);
		this.status = EnumStatusLivre.DISPONIBLE;
		
		

	}

	public Livre(String auteur, String titre, int nbPages) {
		this(auteur, titre, nbPages, -1, null, true);
	}

	public Livre() {

	}

	// Override
	

	@Override
	public String toString() {
		return "\nLIVRE" + "\nLe titre est : "+ titre + "\nL'auteur est : " + auteur + "\nLe nbPages est : " + nbPages + "\nLe prix est : " + prix
				+ "\nLa date d'emprunt est : " + dtf.format(dateEmprunt) + "\nLa disponibilité : " + status.getStatut();
	}
	
	
	
	
	
	
	
	
	
}
