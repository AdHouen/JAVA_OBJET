package bookstore.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import bookstore.metier.Livre;
import bookstore.metier.TypeDeDonnee;
import bookstore.metier.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {

		LocalDateTime dateAchat = LocalDateTime.of(2022, 10, 20, 15, 30, 40);

		Livre asterix = new Livre("asterix et les framboises pas mûres", "auteur d'Asterix", 80, 21.50, dateAchat , new TypeDeDonnee(2023));

		dateAchat = LocalDateTime.of(2022, 2, 25, 12, 40, 32);
		Livre tintin = new Livre("tintin et les mystères de la tasse perdue", "auteur de Tintin", 16, 12.99, dateAchat, new TypeDeDonnee(1990));

		Utilisateur toto = new Utilisateur("aAa", "toto", 123456);
		Utilisateur zozo = new Utilisateur("bBb", "toto", 123456);

		// Si ils veulent emprunter le meme livre sans le rendre entre temps

		toto.EmprunterUnLivre(tintin, LocalDate.now());
		zozo.EmprunterUnLivre(tintin, LocalDate.now());
		System.out.println();

		// En retard ou pas

		LocalDate dateEmprunt = LocalDate.of(2022, 10, 20);
		toto.EmprunterUnLivre(asterix, dateEmprunt);
		displayRetardOrNot(toto);
		System.out.println();

		LocalDate dateEmprunt2 = LocalDate.of(2022, 11, 15);
		toto.EmprunterUnLivre(tintin, dateEmprunt2);
		displayRetardOrNot(toto);
		System.out.println();

		// Rendre livre puis emprunter
		System.out.println("Rendre livre puis emprunter");
		System.out.println();

		toto.rendreLivre(asterix);
		zozo.EmprunterUnLivre(asterix, dateEmprunt2);

		// Trouver le livre
		System.out.println();
		System.out.println("L'utilisateur status : " + toto.findTitreLivreCourant());
		System.out.println("L'utilisateur status : " + zozo.findTitreLivreCourant());

		// Visualiser l'Utilisateur avec la nouvelle methode toString();
		System.out.println();
		System.out.println(zozo);
		
		// Visualiser le Livre avec la nouvelle methode toString();
		System.out.println();
		System.out.println(tintin);
		
		// CAS DISPO 
		System.out.println("\nCAS DISPO\n");
		System.out.println(asterix);
		System.out.println("\nL'utilisateur rend le livre\n");
		zozo.rendreLivre(asterix);
		
		System.out.println("\nLe nouveau status du livre est :\n ");
		System.out.println(asterix);
		
		// CAS NON DISPO 
		System.out.println("\nCAS NON DISPO");
		System.out.println("\nL'utilisateur emprunt le livre\n");
		zozo.EmprunterUnLivre(asterix, dateEmprunt2);
		System.out.println("\nLe nouveau status du livre est :\n ");
		System.out.println(asterix);
		
		
		
		
		
		

	}

	static void displayRetardOrNot(Utilisateur utilisateur) {
		if (utilisateur.isPretEnRetard()) {
			System.out.println("RETARD");
			return;
		}
		System.out.println("PAS EN RETARD");
	}

	

	

}
