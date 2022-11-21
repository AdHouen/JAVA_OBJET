package animal.domain;



/**
 * @author Adrien
 * Top du top de la classe
 *
 */
public class Animal implements Nommable, Comparable<Animal> {

	private String nom;
	
	//Getter

	@Override
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
	
	public void parle() {
		System.out.println("Brrrrrrrrrrrrrrrrrrrrrrrrrrr ");
		
	}

	@Override
	public int compareTo(Animal o) {
		
		return this.nom.compareTo(o.getNom());
	}
	
	 
	

	

	
	

}
