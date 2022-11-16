package bookstore.metier;

import java.util.Comparator;

public class TriParTailleTitreComparator implements Comparator<Livre>{

	@Override
	public int compare(Livre o1, Livre o2) {
		
		return o1.getTitre().length() - o2.getTitre().length();
	}
	
	

}
