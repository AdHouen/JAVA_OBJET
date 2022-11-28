//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\ClientParticulier.java

package achat.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClientParticulier extends Client {
	
	public ClientParticulier(int idClient, ArrayList<Commande> commandes) {
		super(idClient, commandes);
		
	}

	public ClientParticulier(String nom, String prenom, LocalDate dateNaiss) {
		super(nom, prenom, dateNaiss);
		
	}

	private String adressePersonnelle;

	public ClientParticulier() {

	}

	public ClientParticulier(String adressePersonnelle) {
		super();
		this.adressePersonnelle = adressePersonnelle;
	}

	public String getAdressePersonnelle() {
		return adressePersonnelle;
	}

	public void setAdressePersonnelle(String adressePersonnelle) {
		this.adressePersonnelle = adressePersonnelle;
	}
	 
	
}
