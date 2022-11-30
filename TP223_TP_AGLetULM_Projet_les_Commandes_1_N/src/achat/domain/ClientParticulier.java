//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\ClientParticulier.java

package achat.domain;

import java.time.LocalDate;


public class ClientParticulier extends Client {
	
	private String adressePersonnelle;
	
	

	

	public ClientParticulier() {
		super();
		
	}

	public ClientParticulier(int idClient) {
		super(idClient);
		
	}

	public ClientParticulier(String nom, String prenom, LocalDate dateNaiss) {
		super(nom, prenom, dateNaiss);
		
	}

	public String getAdressePersonnelle() {
		return adressePersonnelle;
	}

	public void setAdressePersonnelle(String adressePersonnelle) {
		this.adressePersonnelle = adressePersonnelle;
	}

	 
	
}
