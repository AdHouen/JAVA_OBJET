package bookstore.test;

import java.util.HashSet;

import bookstore.metier.Livre;

public class TestSetLivre {
	
	public static void main(String[] args) {
		
		HashSet<Livre> monPetitLivre = new HashSet<>();
		monPetitLivre.add(new Livre("George Orwell", "1984", 310, 8.84));
		monPetitLivre.add(new Livre("Franck Herbert", "Dune", 907, 11.90));
		monPetitLivre.add(new Livre("J.K Rowling", "Harry Potter à l'école des sorciers", 305));
		monPetitLivre.add(new Livre("Adrien Coucou", "Je suis la", 753, 33.89));
		monPetitLivre.add(new Livre("Philippe Hello", "C'est toi", 310, 35.13));
		
		
		for (Livre livre : monPetitLivre) {
			
			livre.afficheToi();
			System.out.println();
			
		}
		
		// N'affiche pas 2 livres au meme nombre de page, pour lui c'est la meme chose
		
		
	}
	
	
	
	


}
