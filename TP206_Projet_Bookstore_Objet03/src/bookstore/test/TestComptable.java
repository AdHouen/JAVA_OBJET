package bookstore.test;

import bookstore.metier.Livre;

public class TestComptable {
	public static void main(String[] args) {

		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907, 11.90);
		Livre monLivre3 = new Livre("J.K Rowling", "Harry Potter à l'école des sorciers", 305);
		Livre monLivre4 = new Livre("Adrien Coucou", "Je suis la", 753, 33.89);
		Livre monLivre5 = new Livre("Philippe Hello", "C'est toi", 1200, 35.13);
		
		
		System.out.printf("Total de %.2f €\n",Livre.getTotalPrix());
		
		monLivre3.setPrix(15.24);
		System.out.printf("Total de %.2f €\n",Livre.getTotalPrix());
		
		
		
		
		
		
		

	}

}
