package bookstore.test;

import bookstore.metier.Livre;

public class TestLivre {

	public static void main(String[] args) {
		
		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 4000 );
		
		System.out.println(monLivre1);
		
		
		System.out.println();
		
		System.out.println(monLivre2);
		System.out.println();
		monLivre1.setPrix(854);
		System.out.println(monLivre1);
		System.out.println();
		
		
		System.out.println("L'auteur du plus gros livre est :");
		String auteurPlusGrosLivre1 = monLivre1.methodeAuteurPlusGrosLivre(monLivre2);
		System.out.println(auteurPlusGrosLivre1);
		System.out.println();
		System.out.println();
		
		
		/////// QUESTION 3 /////
		
		
		String auteurPlusGrosLivre2;
		auteurPlusGrosLivre2=Livre.compare2(monLivre1,monLivre2)>0?monLivre1.getAuteur():Livre.compare2(monLivre1,monLivre2)<0?monLivre2.getAuteur():"Egalité balle au centre";
		System.out.println(auteurPlusGrosLivre2);
		
		
		
		
		

		

		

		

	}
}
