package bookstore.test;

import java.util.Arrays;

import bookstore.metier.Auteur;
import bookstore.metier.Personne;
import bookstore.metier.Utilisateur;
import bookstore.metier.iBavard;

public class TestPolymorphisme {
	
	public static void main(String[] args) {
		
		// Tableau de Personnes
		
		Personne [] personnes = { 
				new Utilisateur("Houen", "Adrien", 12345, null),
				new Utilisateur("Baptista", "Monique", 98765, null),
				new Auteur("Lopez" , "Denis"),
				new Auteur("Araud" , "Philippe")};
		
		for(Personne var : personnes) {
			System.out.print("La personne " + var.getNom()+ "  dit : "); 
			var.parle();
		}
		
		// ET avec JAVA 8
		System.out.println();
		Arrays.asList(personnes).forEach(x->x.parle());
		System.out.println();
		
		
		// Tableau de iBavard
		
		iBavard [] bavards = { 
				new Utilisateur("Houen", "Adrien", 12345, null),
				new Utilisateur("Baptista", "Monique", 98765, null),
				new Auteur("Lopez" , "Denis"),
				new Auteur("Araud" , "Philippe")};
		
		for (iBavard var : bavards) {
			var.parle();
			
		}
		
		// ET avec JAVA 8
		System.out.println();
		Arrays.asList(bavards).forEach(x->x.parle());
		
		
		
		

	}
	

}

