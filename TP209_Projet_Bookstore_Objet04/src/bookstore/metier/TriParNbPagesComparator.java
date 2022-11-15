package bookstore.metier;

import java.util.Comparator;

public class TriParNbPagesComparator implements Comparator<Livre>{

	@Override
	public int compare(Livre livre1, Livre livre2) {
		
		return livre1.getNbPages() - livre2.getNbPages();
	}

}
