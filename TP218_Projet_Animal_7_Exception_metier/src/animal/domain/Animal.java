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

	public void setNom(String nom) throws AnimalException {
		if (nom.length() > 15) {
			throw new AnimalException("Le nom de l'animal ne doit pas dépasser 15 caractères");
			
		} else {
			this.nom = nom;
		}
		
	}
	
	//Constructeur

	public Animal(String nom) throws AnimalException  {
		setNom(nom);
//		this.nom = nom;
	}
	
	public Animal() {
				
	}
	
	// OVERRIDE

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
