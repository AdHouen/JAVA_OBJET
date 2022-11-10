package bookstore.test;

import bookstore.metier.Livre;

public class TestLivre {

	public static void main(String[] args) {

		Livre monLivre1 = new Livre("George Orwell", "1984", 310);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907);

		System.out.println("L'auteur du Livre 1 est : " + monLivre1.getAuteur());
		System.out.println("L'auteur du Livre 2 est : " + monLivre2.getAuteur());
		System.out.println();
		System.out.println("Le nombre de page du Livre 1 est de : " + monLivre1.getNbPages() + " pages");
		System.out.println("Le nombre de page du Livre 2 est de : " + monLivre2.getNbPages() + " pages");
		System.out.println();
		System.out.println("Le nombre total de page des 2 livres est de : " + (monLivre1.getNbPages() + monLivre2.getNbPages()));
		System.out.println();
		monLivre1.setNbPages(-9);
		System.out.println("Le nombre total de page des 2 livres est de : " + (monLivre1.getNbPages() + monLivre2.getNbPages()));
		System.out.println();

		monLivre1.afficheToi();
		System.out.println();
		monLivre2.afficheToi();
		System.out.println();

		System.out.println(monLivre1);

		////////////// Question 6 /////////////

		// Avec le 1er constructeur
		Livre monLivre3 = new Livre("Adrien", "Coucou c'est moi", 300);
		// Avec le 2eme constructeur
		Livre monLivre4 = new Livre("Adrien", "Coucou c'est moi", 300);
		// Avec le 13eme constructeur
		Livre monLivre5 = new Livre("Adrien", "Coucou c'est moi", 300);

		monLivre3.afficheToi();
		System.out.println();
		monLivre4.afficheToi();
		System.out.println();
		monLivre5.afficheToi();

	}
}
