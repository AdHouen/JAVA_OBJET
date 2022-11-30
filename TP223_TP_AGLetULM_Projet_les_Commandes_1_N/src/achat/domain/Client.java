//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Client.java

package achat.domain;

import java.time.LocalDate;
import java.util.ArrayList;


public class Client extends Personne {
	private int idClient;

	private ArrayList <Commande> commandes = new ArrayList<>(); // association 1_N

	public boolean addCommande(Commande cde) {
		return commandes.add(cde);
	}

	public Client() {

	}
	
	

	public Client(String nom, String prenom, LocalDate dateNaiss) {
		super(nom, prenom, dateNaiss);
		
	}

	public Client(int idClient) {
		super();
		this.idClient = idClient;
		
	}
	
	

	// NOUVELLE Methode getChiffreAffaire (évolution avec la methode getPrix

		public double getChiffreAffaire() {
			
			double chiffreA = 0.;
			for (Commande commande : commandes) {
				chiffreA += commande.getPrix();
				
			}
			
			return chiffreA;
		}

	public static void main(String[] args) {
		Article clavier = new Article(412, "clavier super cool", 10, EnumStatusStock.PLEIN50);
		Article camionPompier = new Article(189, "camion top top",15, EnumStatusStock.PLEIN100);
		
		LigneCommande no1 = new LigneCommande(2, 12345, clavier);
		LigneCommande no2 = new LigneCommande(5, 98765, camionPompier);
		LigneCommande no3 = new LigneCommande(1, 1359, clavier);
		LigneCommande no4 = new LigneCommande(2, 2468, camionPompier);
		

		Commande cdeNoel = new Commande(12345, "Chelles", LocalDate.now());
		Commande cdePaques = new Commande(98765, "Paris", LocalDate.now());
		
		ClientParticulier totoClientParticulier = new ClientParticulier("BOUBOU", "Toto" , LocalDate.of(1989, 11, 13));
		ClientParticulier mamaClientParticulier = new ClientParticulier("Chacha", "Mama" , LocalDate.of(2001, 9, 7));
		
		
		cdeNoel.addLigneCommande(no1);
		cdeNoel.addLigneCommande(no2);
		
		cdePaques.addLigneCommande(no3);
		cdePaques.addLigneCommande(no4);
		
		
		totoClientParticulier.addCommande(cdeNoel);
		totoClientParticulier.addCommande(cdePaques);
		
		// Test methode getChiffreAffaire avec la méthode codé
		
		System.out.println("Voici le chiffre d'affaire de toto avec la methode getChiffreAffaire : " + totoClientParticulier.getChiffreAffaire() + " €");
		
	
		
		
		
		
		
		
		
		

	}
}
