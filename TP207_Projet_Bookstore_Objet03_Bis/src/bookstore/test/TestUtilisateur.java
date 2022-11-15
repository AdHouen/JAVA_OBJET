package bookstore.test;

import java.time.LocalDateTime;

import bookstore.metier.Livre;
import bookstore.metier.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		
		LocalDateTime dateAchat = LocalDateTime.of(2022, 10, 20, 15, 30, 40);
		
		Livre asterix = new Livre("asterix et les framboises pas mûres", "auteur d'Asterix", 80, 21.50, dateAchat);
		 
		dateAchat = LocalDateTime.of(2022, 2, 25, 12, 40, 32);
		Livre tintin = new Livre("tintin et les mystères de la tasse perdue", "auteur de Tintin", 16, 12.99, dateAchat);
		
		Utilisateur toto = new Utilisateur("aAa", "toto", 123456);
		Utilisateur zozo = new Utilisateur("bBb", "toto", 123456);
		
		
		
		// Si ils veulent emprunter le meme livre sans le rendre entre temps
		
		toto.EmprunterUnLivre(tintin, LocalDateTime.now());
		zozo.EmprunterUnLivre(tintin, LocalDateTime.now());
		System.out.println();
		
		// En retard ou pas 
		
		LocalDateTime dateEmprunt = LocalDateTime.of(2022, 10, 20, 15, 30, 40);
        toto.EmprunterUnLivre(asterix, dateEmprunt);
        displayRetardOrNot(toto);
        System.out.println();
        
        LocalDateTime dateEmprunt2 = LocalDateTime.of(2022, 11, 15, 15, 30, 40);
        toto.EmprunterUnLivre(tintin, dateEmprunt2);
        displayRetardOrNot(toto);
        System.out.println();
        
        // Rendre livre puis emprunter
        
        toto.rendreLivre(asterix);
        zozo.EmprunterUnLivre(asterix, dateEmprunt2);
        
        
        
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}
	
	 static void displayRetardOrNot(Utilisateur utilisateur) {
	        if (utilisateur.isPretEnRetard()) {
	            System.out.println("RETARD");
	            return;
	        }
	        System.out.println("PAS EN RETARD");
	    }

}
