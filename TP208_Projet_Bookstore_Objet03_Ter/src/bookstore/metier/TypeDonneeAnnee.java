package bookstore.metier;


public class TypeDonneeAnnee {
	
	public static void main(String[] args) {
		
		TypeDonneeAnnee annee1 = new TypeDonneeAnnee(1989, "Novembre",  3);
		TypeDonneeAnnee annee2 = new TypeDonneeAnnee(2022, "Septembre", 11);

	}
	
	private int annee;
	private String mois;
	private int jours;
	
	public TypeDonneeAnnee(int uneAnnee, String unMois, int unJour) {
		this.annee = uneAnnee;
		this.mois = unMois;
		this.jours = unJour;
		
		
		

	}


	

	

}
