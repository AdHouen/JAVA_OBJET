package bookstore.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;

import bookstore.metier.BiblioException;
import bookstore.metier.Livre;
import bookstore.metier.Utilisateur;


public class TestLivre {

	public static void main(String[] args) throws ParseException {
		
		
		System.out.println("**********************************");
		System.out.println("*****     ASSOC 1-N unidir  ******");
		System.out.println("**********************************");
		
		 
		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84, LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907, 11.90, LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre3 = new Livre("Uderzo", "Asterix", 25, 12.65, LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre4 = new Livre("Herge", "Tintin", 13, 7.24, LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre5 = new Livre("J.K Rowling", "Harry Potter à l'école des sorciers", 305, 0,LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre6 = new Livre("Adrien Coucou", "Je suis la", 310, 33.89, LocalDate.parse("01/02/2016",Livre.dtf), true);
		Livre monLivre7 = new Livre("Philippe Hello", "C'est toi", 1200, 35.13, LocalDate.parse("01/02/2016",Livre.dtf), true);
		
		
		
		
	
		Utilisateur utilisateur1 = new Utilisateur("MARIE JOSEPH", "Carthy", 123456);
		
		Utilisateur utilisateur2 = new Utilisateur("HOUEN", "Adrien", 131313);
	
		Utilisateur utilisateur3 = new Utilisateur("BAPTISTA", "Monique", 212121);
		
		Utilisateur utilisateur4 = new Utilisateur("ARAUD", "Philippe", 020202);
		
		
		try {
			utilisateur1.addLivre((monLivre1), LocalDate.now());
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
			
			
		}
		try {
			utilisateur1.addLivre((monLivre2), LocalDate.now());
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
			
			
		}
		try {
			utilisateur1.addLivre((monLivre3), LocalDate.now()); 
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
			
			
		}
		try {
			utilisateur1.addLivre((monLivre4), LocalDate.now());
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
			
		}
		
		System.out.println(utilisateur1);
		
		System.out.println("\nNombre de livres emprutés : " + utilisateur1.getLivres().size() + " livre(s)");
		
	
		
		// Afichage de tous les livres empruntés :  AVEC ITERATOR
		
		if(utilisateur1.getLivres().size() >=1 )
		{
			Iterator<Livre> it = utilisateur1.getLivres().iterator();
			Livre maListDeLivre;
			while( it.hasNext()){
				maListDeLivre = it.next();
				System.out.println("\t Titre : " + maListDeLivre.getTitre());
			}
		}
		else
			System.out.println("Pas de livre emprunté");
		System.out.println();
		
		
//		for(Livre m:utilisateur1.getLivres()) {
//			System.out.println(m.getTitre());
//		}
		
		// Voir le statut
		
		System.out.println(monLivre1.getStatus()); // ENUM  "PRETE"
		System.out.println(monLivre1.getStatus().getStatut()); // ENUM STRING "prété"
		
		
		// Modification du toString pour afficher l'utilisateur et ses emrpunts : 
		System.out.println("\nModification du toString pour afficher l'utilisateur et ses emrpunts : ");
		
		
		System.out.println(utilisateur1);
		
		// Retourner le livre emprunté par le titre findLivreByTitre 
		System.out.println("\nRetourner le livre emprunté par le titre");
		System.out.println(utilisateur1.findLivreByTitre("asterix"));
		
		// findAllLivres TEST
		
		System.out.println("\nMéthode findAllLivres");
		System.out.println(utilisateur1.findAllLivres());
		
		// containslivre TEST

		System.out.println("\nMéthode containslivre");
		System.out.println(utilisateur1.containsLivre(monLivre2)); // True
		System.out.println(utilisateur1.containsLivre(monLivre3)); // True
		System.out.println(utilisateur1.containsLivre(monLivre7)); // False
		
		// removeLivre TEST
		
		System.out.println("\nMéthode removeLivre");
		System.out.println(utilisateur1.containsLivre(monLivre2)); // True
		utilisateur1.removeLivre(monLivre2); // removeLivre
		System.out.println(utilisateur1.containsLivre(monLivre2)); // False
		
		// isConditionsPretAcceptees
		
		System.out.println("\nMéthode isConditionsPretAcceptees");
		System.out.println(utilisateur1.isConditionsPretAcceptees());
		
		
		
		
		
		
		

	}
	

	
	
	

	
	
	
}
