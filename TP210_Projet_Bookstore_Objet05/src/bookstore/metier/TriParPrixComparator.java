package bookstore.metier;

import java.util.Comparator;

public class TriParPrixComparator implements Comparator<Livre>{

	@Override
	public int compare(Livre o1, Livre o2) {
		
		// METHODE 1
		
		
//		if (o1.getPrix() > o2.getPrix()) return -1;
//        if (o1.getPrix() < o2.getPrix()) return 1;
//        return 0;  
		
		// METHODE 2
		
		return Double.compare(o1.getPrix(), o2.getPrix());
		
		
		
		
	}

}
