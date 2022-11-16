package bookstore.metier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilisateur {

	private String nom;
	private String prenom;
	private int idUtilisateur;
	private Livre livreEmprunt;
	private LocalDate dateEmprunt = LocalDate.now();
	private static int dureeMaxPret = 15;
//	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Livre getLivreEmprunt() {
		return livreEmprunt;
	}

	public void setLivreEmprunt(Livre livreEmprunt) {
		this.livreEmprunt = livreEmprunt;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Utilisateur(String nom, String prenom, int idUtilisateur, Livre livreEmprunt, LocalDate dateEmprunt) {
		this.nom = nom;
		this.prenom = prenom;
		this.idUtilisateur = idUtilisateur;
		this.livreEmprunt = livreEmprunt;
		this.dateEmprunt = dateEmprunt;
	}

	public Utilisateur(String nom, String prenom, int idUtilisateur) {
		this(nom, prenom, idUtilisateur, null, null);

	}

	public Utilisateur() {
	}

	public void EmprunterUnLivre(Livre livre, LocalDate dateEmprunt) {
		if (livre.getStatusDuLivre().equals(EnumStatusLivre.DISPONIBLE)) {
			this.livreEmprunt = livre;
			this.dateEmprunt = dateEmprunt;
			System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté");
			livre.setDisponible(false);
			livre.setStatusDuLivre(EnumStatusLivre.PRETE);
			return;
		}
		System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour un emprunt");
	}

	public void rendreLivre(Livre livre) {
		if (this.livreEmprunt == null) {
			System.out.println("Erreur : Impossible de rendre un livre non possédé");
			return;
		}
		livre.setStatusDuLivre(EnumStatusLivre.DISPONIBLE);
		this.livreEmprunt = null;
		this.dateEmprunt = null;
		System.out.println("Le livre " + livre.getTitre() + " a bien été rendu");
	}

	public boolean isPretEnRetard() {
		return this.dateEmprunt.plusDays(dureeMaxPret + 1).isBefore(LocalDate.now());
	}

	// Methode en plus pour trouver le livre correspondant à la personne

	public String findTitreLivreCourant() {
		String retour = null;

		if (livreEmprunt != null) {
			retour = livreEmprunt.getTitre();
		} else {
			retour = "Pas de livre emprunté";
		}
		return retour;
	}
	
	

	// OVERRIDE

	@Override
	public String toString() {
		return "L'utilisateur NOM est : " + nom 
				+ "\nL'utilisateur PRENOM est : " + prenom 
				+ "\nL'idUtilisateur : " + idUtilisateur
				+ "\nLe livre emprunté est : " + (livreEmprunt == null ? "Pas de livre emprunté": livreEmprunt.getTitre() 
				+ "\nLa date d'emprunt est : " + (dateEmprunt == null ? "Pas de date d'emprunt" : dateEmprunt));
	}

}
