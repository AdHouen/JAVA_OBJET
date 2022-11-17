package bookstore.metier;

public class TypeDeDonnee {
	
	private int annee;
	
	 public TypeDeDonnee(int annee) {
	        this.annee = annee;
	    }
	
	 public int getAnnee() {
		 
			return annee;
		}

	public void setAnnee(int annee) {
			this.annee = annee;
		}

//	public static TypeDeDonnee donneeAnnee(int annee) {
//        if (annee > 0) {
//            return new TypeDeDonnee(annee);
//        }
//        throw new IllegalArgumentException("ERROR : L'année n'est pas un entier supérieur à 0");
//    }

}
