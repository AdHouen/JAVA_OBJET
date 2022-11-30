//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\ClientProfessionnel.java

package achat.domain;

import java.time.LocalDate;

public class ClientProfessionnel extends Client 
{
   private String noSiret;

public ClientProfessionnel() {
	super();
	
}

public ClientProfessionnel(int idClient) {
	super(idClient);
	
}

public ClientProfessionnel(String nom, String prenom, LocalDate dateNaiss) {
	super(nom, prenom, dateNaiss);

}
   

   
}
