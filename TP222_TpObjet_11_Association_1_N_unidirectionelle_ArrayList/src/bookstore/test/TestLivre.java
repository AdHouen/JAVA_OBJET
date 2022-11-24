package bookstore.test;

import java.text.ParseException;
import java.time.LocalDate;

import bookstore.metier.Livre;
import bookstore.metier.Utilisateur;


public class TestLivre {

	public static void main(String[] args) throws ParseException {
		
		
		System.out.println("**********************************");
		System.out.println("*****     ASSOC 1-1 unidir  ******");
		System.out.println("**********************************");
		
		 
		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84, Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907, 11.90, Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre3 = new Livre("Uderzo", "Asterix", 25, 12.65, Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre4 = new Livre("Herge", "Tintin", 13, 7.24, Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre5 = new Livre("J.K Rowling", "Harry Potter à l'école des sorciers", 305, 0,Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre6 = new Livre("Adrien Coucou", "Je suis la", 310, 33.89, Livre.sdf.parse("01/02/2016"), true);
		Livre monLivre7 = new Livre("Philippe Hello", "C'est toi", 1200, 35.13, Livre.sdf.parse("01/02/2016"), true);
		
		LocalDate dateEmprunt1 = LocalDate.of(2022, 10, 20);
		Utilisateur utilisateur1 = new Utilisateur("MARIE JOSEPH", "Carthy", 123456, dateEmprunt1);
		LocalDate dateEmprunt2 = LocalDate.of(2022, 11, 24);
		Utilisateur utilisateur2 = new Utilisateur("HOUEN", "Adrien", 131313, dateEmprunt2);
		LocalDate dateEmprunt3 = LocalDate.of(2022, 11, 20);
		Utilisateur utilisateur3 = new Utilisateur("BAPTISTA", "Monique", 212121, dateEmprunt3);
		LocalDate dateEmprunt4 = LocalDate.of(2022, 11, 01);
		Utilisateur utilisateur4 = new Utilisateur("ARAUD", "Philippe", 020202, dateEmprunt4);
		
		
//		///////////////////////////////////////////////////
//		// SCRENARIO EMPRUNT
//		System.out.println("*****     EMPRUNT DE LIVRE *******");
//		System.out.println("**********************************");
//		System.out.println("Utilisateur1 emprunte un livre monLivre1 et Utilisateur2 emprunte un livre monLivre2 ");
//		System.out.println("-----------------------");
//		utilisateur1.setEmprunt(monLivre1);
//		utilisateur2.setEmprunt(monLivre2);
//		
//		utilisateur1.getEmprunt().setDisponible(false);//On navigue l'association
//		utilisateur2.getEmprunt().setDisponible(false);//On navigue l'association
//		
//		
//		// Qui a emprunter quel Livre ? 
//		
//		if( utilisateur1.getEmprunt()!= null)
//			System.out.println("Le titre du livre emprunté par utilisateur1 est : " + utilisateur1.getEmprunt().getTitre());
//		else
//			System.out.println("Pas de livre emprunté par u1");
//		
//		if( utilisateur2.getEmprunt()!= null)
//			System.out.println("Le titre du livre emprunté par utilisateur2 est : " + utilisateur2.getEmprunt().getTitre());
//		else
//			System.out.println("Pas de livre emprunté par u1");
//		
//		
//		System.out.println();
//		System.out.println("**********************************");
//		System.out.println("*****      RETOUR DE LIVRE *****");
//		System.out.println("**********************************");
//		//On rend le livre
//		System.out.println("u1 rend son livre");
//		System.out.println("-----------------");
//		
//		utilisateur1.getEmprunt().setDisponible(true);
//		utilisateur1.setEmprunt(null); //Désormais, attention au NullPointerException
//		System.out.println("tostring() de utilisateur u1 " + utilisateur1);
//
//		//affichage du titre du livre emprunté
//		if( utilisateur1.getEmprunt()!= null)
//			System.out.println("Le livre emprunté est :" + utilisateur1.getEmprunt().getTitre());
//		else
//			System.out.println("Pas de livre emprunté");
		
		
		
		/////////////////////////////////////////////////
		// SCRENARIO EMPRUNT 2
		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****     EMPRUNT DE LIVRE *******");
		System.out.println("**********************************");
		System.out.println("Utilisateur1 emprunte un livre monLivre1 et Utilisateur2 emprunte un livre monLivre2 ");
		System.out.println("-----------------------");
		utilisateur1.EmprunterUnLivre(monLivre1, dateEmprunt1);
		utilisateur2.EmprunterUnLivre(monLivre2, dateEmprunt2);
		
		
		System.out.println("\nQui a emprunter quel livre ?\n");
		
		
		System.out.println(utilisateur1.findTitreLivreCourant());
		System.out.println(utilisateur2.findTitreLivreCourant());
		
		
		// Retour des livres
		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****      RETOUR DE LIVRE *****");
		System.out.println("**********************************");
		System.out.println("Utilisateur1 et Utilisateur2 rendent leurs livres");
		System.out.println("-----------------------");
		
		
		utilisateur1.rendreLivre(monLivre1);
		System.out.println("Le livre 2 est : " + monLivre2.getStatus().getStatut());
		utilisateur2.rendreLivre(monLivre2);
		
		System.out.println("Le livre 1 est : " + monLivre1.getStatus().getStatut());
		System.out.println("Le livre 2 est : " + monLivre2.getStatus().getStatut());
		
		// On emprunte un autre livre
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("*****   EMPRUNT D'UN AUTRE LIVRE    *****");
		System.out.println("*****************************************");
		System.out.println("\n Utilisateur 1 emprunte monLivre4\n");
		utilisateur1.EmprunterUnLivre(monLivre4, dateEmprunt4);
		System.out.println();
		System.out.println("\n Utilisateur 2 emprunte monLivre4\n");
		utilisateur2.EmprunterUnLivre(monLivre4, dateEmprunt4);
		System.out.println();
		
		
		System.out.println("L'utilisateur 1 possede : " + utilisateur1.findTitreLivreCourant());
		System.out.println("L'utilisateur 2 possede : " + utilisateur2.findTitreLivreCourant());
		
		
		
		
		// Question 6 
		
		System.out.println("\nQuestion 6\n");
		
		LocalDate dateEmprunt5 = LocalDate.of(2022, 11, 20);
		utilisateur1.EmprunterUnLivre(monLivre1, dateEmprunt5);
		afficherEnRetardOuiNon(utilisateur1);
		System.out.println();

		LocalDate dateEmprunt6 = LocalDate.of(2022, 10, 20);
		utilisateur2.EmprunterUnLivre(monLivre2, dateEmprunt6);
		afficherEnRetardOuiNon(utilisateur2);
		System.out.println();
		
		
		
		
		
		// test pour retrouver l'utilisateur du livre
		
		
	
		System.out.println(monLivre4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println();
//		System.out.println("Maintenant trié du plus grand au plus petit grace à la methode compareTo");
//		System.out.println();
//		Arrays.sort(maBibli);
//		for (Livre livre : maBibli) {
//			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
//		}
//		
//		
//		
//		
//		// Comparaison avec COMPARATOR
//		System.out.println();
//		System.out.println("Comparaison avec COMPARATOR pour le NbPages");
//		System.out.println();
//		List <Livre> maBibliArrayList = new ArrayList<>();
//		maBibliArrayList.add(monLivre1);
//		maBibliArrayList.add(monLivre2);
//		maBibliArrayList.add(monLivre3);
//		maBibliArrayList.add(monLivre4);
//		maBibliArrayList.add(monLivre5);
//		maBibliArrayList.add(monLivre6);
//		maBibliArrayList.add(monLivre7);
//		
		
		
		
		

	}
	

	static void afficherEnRetardOuiNon(Utilisateur utilisateur) {
		if (utilisateur.isPretEnRetard()) {
			System.out.println("Le livre est EN RETARD");
			return;
		}
		System.out.println("Le livre n'est PAS EN RETARD");
	}
	
	

	
	
	
}
