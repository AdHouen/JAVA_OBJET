package bookstore.metier;


public class Utilisateur extends Personne {

	private int idUtilisateur;
	private Livre livreEmprunt;

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public Livre getLivreEmprunt() {
		return livreEmprunt;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public void setLivreEmprunt(Livre livreEmprunt) {
		this.livreEmprunt = livreEmprunt;
	}

	public Utilisateur(String nom, String prenom, int idUtilisateur, Livre livreEmprunt) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
		this.livreEmprunt = livreEmprunt;
	}
	
	public Utilisateur() {
		this("Nom_Inconnu","Prenom_Inconnu", 0000, null);
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nLe numero d'utilisateur est : " + idUtilisateur 
				+ ((livreEmprunt==null)?"\nPas de Livre emprunté":"\nLe livre emprunté est :" + livreEmprunt);
	}
	
	@Override
	public void parle() {
		System.out.println("La cotisation est trop chere");
		
	}
	
	
	
	public static void main(String[] args) {
		

		Utilisateur adrienUtilisateur = new Utilisateur("Houen", "Adrien", 12345, null);
		
		System.out.println(adrienUtilisateur);
		adrienUtilisateur.parle();
		
		
		
	}

	
	

}
