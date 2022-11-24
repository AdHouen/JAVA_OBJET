package bookstore.metier;

import java.time.LocalDate;

public class Utilisateur extends Personne {


	private Integer idUtilisateur;
	
	private Livre emprunt; //association 1 à 1
	
	private LocalDate dateEmprunt = LocalDate.now();
	private static Integer dureeMaxPret = 15;

	// Constructeur

	public Utilisateur(String nom, String prenom, Integer idUtilisateur, LocalDate dateEmprunt) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
		this.dateEmprunt = dateEmprunt;
	}

	public Utilisateur() {
		super();
		this.idUtilisateur = 00000;

	}
	// Getter

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public Livre getEmprunt() {
		return emprunt;
	}
	
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	// Setter

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public void setEmprunt(Livre newEmprunt) {
		if( newEmprunt != null) { // On emprunte un livre
			if (getEmprunt() == null){ //il n'y a pas de livre  emprunté
				
				emprunt = newEmprunt;
			}
			else//il y a déjà un  livre  emprunté
			{
				if( getEmprunt().getUtilisateur() != this) {
					getEmprunt().setUtilisateur(this);
					//getEmprunt().setDisponible(false);
					//getEmprunt().setDateEmprunt(new Date());
					
					emprunt = newEmprunt;


				}
				else {//on ne fait rien
				}
			}
		}
		else {//On rend un livre //newEmprunt == null
			
			if (getEmprunt() !=null){
				getEmprunt().setDisponible(true);
				getEmprunt().setUtilisateur(null);
				this.emprunt = null;
			}
			else {
				throw new IllegalArgumentException("cas impossible");
			}
		}
		
	}
	
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	

	
	
	// Override
	
	@Override
	public String toString() {
		return super.toString() + "\nUTILISATEUR\n"+ "ID : "+ idUtilisateur +  "\nLe titre du livre est : "+ (emprunt == null?"Pas de livre":emprunt.getTitre());
	}
	
	// Methode pour emprunter un livre

	public void EmprunterUnLivre(Livre livre, LocalDate dateEmprunt) {
		if (livre.getStatus().equals(EnumStatusLivre.DISPONIBLE)) {
			this.emprunt = livre;
			this.dateEmprunt = dateEmprunt;
			System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté");
			livre.setDisponible(false);
			livre.setUtilisateur(this);
			livre.setStatus(EnumStatusLivre.PRETE);
			return;
		}
		System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour un emprunt");
	}
	
	// Methode pour rendre un livre

	public void rendreLivre(Livre livre) {
		if (this.emprunt == null) {
			System.out.println("Erreur : Impossible de rendre un livre non possédé");
			return;
		}
		livre.setStatus(EnumStatusLivre.DISPONIBLE);
		this.emprunt = null;
		this.dateEmprunt = null;
		livre.setUtilisateur(null);
		System.out.println("Le livre " + livre.getTitre() + " a bien été rendu"); 
	}
	
	// Methode en plus pour trouver le livre correspondant à la personne

		public String findTitreLivreCourant() {
			String retour = null;

			if (emprunt != null) {
				retour = ("Le livre emprunté est : " + emprunt.getTitre());
			} else {
				retour = "Pas de livre emprunté";
			}
			return retour;
		}
		
	// Methode pour savoir si le pret est en retard de + de 15 jours
	
		public boolean isPretEnRetard() {
			return this.dateEmprunt.plusDays(dureeMaxPret + 1).isBefore(LocalDate.now());
		}
		
		
	
	
	
	

}
