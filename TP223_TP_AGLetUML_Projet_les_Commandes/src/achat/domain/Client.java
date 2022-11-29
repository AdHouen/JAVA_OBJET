//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Client.java

package achat.domain;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

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
	// QUestion 3.2
	// Methode getChiffreAffaire codé

	public double getChiffreAffaire() {
		
		double chiffreA = 0.;
		for (Commande commande : commandes) {
			chiffreA += (commande.getArticle().getPrixUnitaire()*commande.getQte());
			
		}
		
		return chiffreA;
	}
	
	// Question 3.3
	// NOUVELLE Methode getChiffreAffaire (évolution avec la methode getPrix

		public double getChiffreAffaire2() {
			
			double chiffreA = 0.;
			for (Commande commande : commandes) {
				chiffreA += (commande.getPrix());
				
			}
			
			return chiffreA;
		}

	public static void main(String[] args) {
		Article clavier = new Article(412, "clavier super cool", 37, EnumStatusStock.PLEIN50);
		Article camionPompier = new Article(189, "camion top top", 52, EnumStatusStock.PLEIN100);

		Commande cdeNoel = new Commande(12345, "Chelles", LocalDate.now(), 2);
		cdeNoel.setArticle(clavier);

		Commande cdePaques = new Commande(98765, "Paris", LocalDate.now(), 4);
		cdePaques.setArticle(camionPompier);
		
		
		
		ClientParticulier totoClientParticulier = new ClientParticulier("BOUBOU", "Toto" , LocalDate.of(1989, 11, 13));
		
		totoClientParticulier.addCommande(cdeNoel);
		totoClientParticulier.addCommande(cdePaques);
		
		// Test methode getChiffreAffaire avec la méthode codé
		
		System.out.println("Voici le chiffre d'affaire de toto avec la methode getChiffreAffaire : " + totoClientParticulier.getChiffreAffaire() + " €");
		
		// Test methode getPrix() avec la méthode codé dans la Commande
		
		System.out.println("\nVoici le chiffre d'affaire de toto avec la methode getPrix : " + totoClientParticulier.getChiffreAffaire2() + " €");
		
		
		
		
		
		
		
		

	}
}
