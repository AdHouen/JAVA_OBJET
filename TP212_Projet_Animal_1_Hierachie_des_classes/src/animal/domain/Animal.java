package animal.domain;

public class Animal {

	private String nom;
	
	//Getter

	public String getNom() {
		return nom;
	}
	
	//Setter

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Constructeur

	public Animal(String nom) {
		super();
		this.nom = nom;
	}
	
	public Animal() {
				
	}

	@Override
	public String toString() {
		return (nom==null?"je suis un animal .":"je suis un animal de nom " + nom +"."); 
	}
	
	

}
