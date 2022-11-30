package achat.domain;


public class LigneCommande {
	
	private int qte;
	
	private int noCommande;
	
	private Article article;
	
	
	
	// Constructeur

	public LigneCommande(int qte, int noCommande) {
		super();
		this.qte = qte;
		this.noCommande = noCommande;
	}
	
	
	
	public LigneCommande(int qte, int noCommande, Article article) {
		super();
		this.qte = qte;
		this.noCommande = noCommande;
		this.article = article;
	}



	// GETTER
	public int getQte() { 
		return qte; 
	}

	public int getNoCommande() {
		return noCommande;
	}
	
	public Article getArticle() {
		return article;
	}

	// SETTER

	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public void setNoCommande(Integer noCommande) {
		this.noCommande = noCommande;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}
	
	// Methode 
	
	
	public double getPrix() {
		return this.getArticle().getPrixUnitaire()*qte;
	}

	

	
	
	

}
