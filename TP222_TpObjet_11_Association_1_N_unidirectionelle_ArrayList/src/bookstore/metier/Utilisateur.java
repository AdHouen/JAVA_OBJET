package bookstore.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Utilisateur extends Personne {

	private Integer idUtilisateur;
	private String msg;


	private static Integer dureeMaxPret = 15;

	private ArrayList<Livre> livres = new ArrayList<>(); // association 1 à N

	private static Integer nbMaxPrets = 3;

	// Setter et Getter de l'arrayList

	public ArrayList<Livre> getLivres() {
		return livres;
	}

	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}

	// Constructeur

	public Utilisateur(String nom, String prenom, Integer idUtilisateur) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
		
	}

	public Utilisateur() {
		super();
		this.idUtilisateur = 00000;

	}
	// Getter

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	

	// Setter

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	

	// Override

	@Override
	public String toString() {
		if (livres.size() == 0) {
			return getPrenom() + " n'a pas de livre emprunté";
		} else {
			msg = super.toString() + "\nUTILISATEUR ID : " + idUtilisateur + "\nLivre(s) emprunté(s) : ";
			this.livres.forEach(x -> msg += "\n" + x.getTitre());

			return msg;
		}

	}

	// METHODES

	// Methode aadLivre pour passer par l'association 1-N pour Emprunter un livre

	public void addLivre(Livre livre, LocalDate dateEmprunt) throws BiblioException {
		if (livre.getStatus().equals(EnumStatusLivre.DISPONIBLE) && livres.size() < nbMaxPrets) {
			this.livres.add(livre);
			livre.setDateEmprunt(dateEmprunt);
			System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté");
			livre.setDisponible(false);
			livre.setStatusDuLivre(EnumStatusLivre.PRETE);
			return;
		}
		System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour un emprunt");
		throw new BiblioException("Vous avez atteint le nombre maximal de prêt qui est de " + nbMaxPrets);
	}

	// Méthode clearLivres qui vide l'utilisateur de ses emprunts

	public void clearLivres() {
		for (Livre varLivre : livres) {
			varLivre.setDisponible(true);
			varLivre.setStatusDuLivre(EnumStatusLivre.DISPONIBLE);
			varLivre.setDateEmprunt(LocalDate.now());

		}

		livres.clear();
		System.out.println(getPrenom() + " " + getNom() + " a bien rendu tous les livre en une seul fois");
	}

	// Méthode findLivreByTitre

	public Livre findLivreByTitre(String titre) {
		for (Livre livreTitre : livres) {
			if (livreTitre.getTitre().equalsIgnoreCase(titre))
				return livreTitre;
		}
		return null;

	}

	// Méthode findAllLivres

	public ArrayList<Livre> findAllLivres() {
		return getLivres();

	}

	// Méthode containsLivre

	public boolean containsLivre(Livre livreContains) {
		return livres.contains(livreContains);

	}

	// Méthode removeLivre

	public void removeLivre(Livre livreRemove) {
		if (!this.livres.contains(livreRemove)) {
			System.out.println("Erreur : Impossible de rendre un livre non possédé");
			return;
		}

		livres.remove(livreRemove);
		livreRemove.setStatusDuLivre(EnumStatusLivre.DISPONIBLE);
		livreRemove.setDisponible(true);
		livreRemove.setDateEmprunt(null);
		System.out.println("Le livre " + livreRemove.getTitre() + " a bien été rendu");
	}

	// Méthode isConditionsPretAcceptees et getnbRetards
	
	public int getNbRetards() {
        int nbRetard = 0;
        for (Livre livreRetard : livres) {
            if (isPretEnRetard(livreRetard)) {
            	nbRetard++;
            }
        }
        return nbRetard;
    }
	
	public boolean isConditionsPretAcceptees() {
		if (livres.size()<nbMaxPrets && getNbRetards() ==0) {
			
		}
		return true ;
	}

	// Methode pour savoir si le pret est en retard de + de 15 jours

	public boolean isPretEnRetard(Livre livre) {
		return livre.getDateEmprunt().plusDays(dureeMaxPret + 1).isBefore(LocalDate.now());
	}

}
