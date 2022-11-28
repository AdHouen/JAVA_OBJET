//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Client.java

package achat.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client extends Personne {
	private int idClient;

	private ArrayList<Commande> commandes = new ArrayList<>(); // association 1_N

	public boolean addCommande(Commande cde) {
		return commandes.add(cde);
	}

	public Client() {

	}
	
	

	public Client(String nom, String prenom, LocalDate dateNaiss) {
		super(nom, prenom, dateNaiss);
		
	}

	public Client(int idClient, ArrayList<Commande> commandes) {
		super();
		this.idClient = idClient;
		this.commandes = commandes;
	}

	public double getChiffreAffaire() {
		return 0.;
	}

	public static void main(String[] args) {
		Article clavier = new Article(412, "clavier super cool", 37, EnumStatusStock.PLEIN50);
		Article camionPompier = new Article(189, "camion top top", 52, EnumStatusStock.PLEIN100);

		Commande cdeNoel = new Commande(12345, "Chelles", LocalDate.now(), 2);
		cdeNoel.setArticle(clavier);

		Commande cdePaques = new Commande(98765, "Paris", LocalDate.now(), 4);
		cdePaques.setArticle(camionPompier);
		
		
		
		ClientParticulier totoClientParticulier = new ClientParticulier("BOUBOU", "Toto" , LocalDate.of(1989, 11, 13));
		
		
		System.out.println("Voici le chiffre d'affaire de toto : " + totoClientParticulier.getChiffreAffaire());

	}
}
