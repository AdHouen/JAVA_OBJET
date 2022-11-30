//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Commande.java

package achat.domain;

import java.time.LocalDate;

public class Commande {
	private int noCommande;
	private String adresseLivraison;
	private LocalDate dateCommande;
	private int qte;

	private  Article article;// association 1_1
	
	
	// Constructeur

	public Commande() {

	}

	public Commande(int noCommande, String adresseLivraison, LocalDate dateCommande, int qte) {
		this(noCommande, adresseLivraison, dateCommande, qte, null);

	}

	public Commande(int noCommande, String adresseLivraison, LocalDate dateCommande, int qte, Article article) {
		super();
		this.noCommande = noCommande;
		this.adresseLivraison = adresseLivraison;
		this.dateCommande = dateCommande;
		this.qte = qte;
		this.article = article;
	}
	
	// Getter

	public Article getArticle() {
		return article;
	}

	public int getQte() {
		return qte;
	}
	
	// Setter

	public void setArticle(Article article) {
		this.article = article;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	
	// Methode

	public double getPrix() {
		return this.getArticle().getPrixUnitaire() * qte;
	}

}
