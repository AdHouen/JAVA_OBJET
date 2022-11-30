//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Commande.java

package achat.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Commande {
	private int noCommande;
	private String adresseLivraison;
	private LocalDate dateCommande;

	private ArrayList<LigneCommande> lignesCommandes = new ArrayList<>();
	
	public boolean addLigneCommande(LigneCommande ligneCde) {
		return lignesCommandes.add(ligneCde);
	}

	//GETTER 
	public int getNoCommande() {
		return noCommande;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public LocalDate getDateCommande() {
		return dateCommande;
	}

	public ArrayList<LigneCommande> getLignesCommandes() {
		return lignesCommandes;
	}

	// SETTER

	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public void setDateCommande(LocalDate dateCommande) {
		this.dateCommande = dateCommande;
	}

	public void setLigneCommande(ArrayList<LigneCommande> lignesCommandes) {
		this.lignesCommandes = lignesCommandes;
	}

	
	
	// Constructeur
	
	public Commande () {
		
	}
	
	public Commande(int noCommande, String adresseLivraison, LocalDate dateCommande) {
		super();
		this.noCommande = noCommande;
		this.adresseLivraison = adresseLivraison;
		this.dateCommande = dateCommande;
		
	}
	
	// Methode
	
	public double getPrix () {
		double chiffreA = 0.;
		for (LigneCommande ligneCommande : lignesCommandes) {
			chiffreA += ligneCommande.getPrix();
			
			
		}
		
		return chiffreA;
	}
	
	
	
}
