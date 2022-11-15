package bookstore.metier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Utilisateur {
	
	private String nom;
	private String prenom;
	private int idUtilisateur;
	private Livre livreEmprunt;
	private LocalDateTime dateEmprunt = LocalDateTime.now();
	private static int dureeMaxPret = 15;
	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
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
	public Livre getLivre() {
		return livreEmprunt;
	}
	public void setLivre(Livre livreEmprunt) {
		this.livreEmprunt = livreEmprunt;
	}
	public LocalDateTime getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(LocalDateTime dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public Utilisateur (String nom, String prenom, int idUtilisateur, Livre livreEmprunt, LocalDateTime dateEmprunt) {
		this.nom = nom;
		this.prenom = prenom;
		this.idUtilisateur = idUtilisateur;
		this.livreEmprunt = livreEmprunt;
		this.dateEmprunt = dateEmprunt;
	} 
	
	public Utilisateur (String nom, String prenom, int idUtilisateur) {
		this(nom, prenom, idUtilisateur, null, null);
		
		
	} 
	
	public Utilisateur () {
	}
	
	public void EmprunterUnLivre(Livre livre, LocalDateTime dateEmprunt) {
		if (livre.isDisponible()) {
			this.livreEmprunt = livre;
			this.dateEmprunt = dateEmprunt;
			System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté");
			livre.setDisponible(false);
				
			return;
		}
		System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour un emprunt");  		
	}
	
	 public void rendreLivre(Livre livre){
	        if (!this.livreEmprunt.equals(livre)){
	            System.out.println("Erreur : Impossible de rendre un livre non possédé");
	            return;
	        }
	        livre.setDisponible(true);
	        this.livreEmprunt = null;
	        this.dateEmprunt = null;
	        System.out.println("Le livre " + livre.getTitre() + " a bien été rendu");
	    }
	
	public boolean isPretEnRetard(){
        return this.dateEmprunt.plusDays(dureeMaxPret+1).isBefore(LocalDateTime.now());
    }
	
	
	

	
	
	
	
	
	
	
	

}
