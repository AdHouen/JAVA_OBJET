package bookstore.test;


import bookstore.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import bookstore.metier.Livre;
import bookstore.metier.TriParNbPagesComparator;
import bookstore.metier.TriParPrixComparator;
import bookstore.metier.TriParTailleTitreComparator;
import bookstore.metier.TypeDeDonnee;

public class TestLivre {

	public static void main(String[] args) {
		 
		TypeDeDonnee annee = new TypeDeDonnee(2022);
		Livre monLivre1 = new Livre("George Orwell", "1984", 310, 8.84, null, new TypeDeDonnee(2023) );
		Livre monLivre2 = new Livre("Franck Herbert", "Dune", 907, 11.90, null, new TypeDeDonnee(2010));
		Livre monLivre3 = new Livre("Uderzo", "Asterix", 25, 12.65, null, new TypeDeDonnee(2009));
		Livre monLivre4 = new Livre("Herge", "Tintin", 13, 7.24, null, new TypeDeDonnee(2009));
		Livre monLivre5 = new Livre("J.K Rowling", "Harry Potter à l'école des sorciers", 305, 0, null, new TypeDeDonnee(1990));
		Livre monLivre6 = new Livre("Adrien Coucou", "Je suis la", 310, 33.89, null, new TypeDeDonnee(1996));
		Livre monLivre7 = new Livre("Philippe Hello", "C'est toi", 1200, 35.13, null, new TypeDeDonnee(2000));
		
		
		
		
		System.out.println(monLivre3.compareTo(monLivre7));
		System.out.println(monLivre2.compareTo(monLivre4));
		System.out.println(monLivre1.compareTo(monLivre6));
		
		// Livres dans un tableau 
		System.out.println("Pas trié, juste dans le tableau");
		System.out.println();
		Livre [] maBibli = {monLivre1, monLivre2, monLivre3, monLivre4, monLivre5, monLivre6, monLivre7};
		for (Livre livre : maBibli) {
			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
		}
		System.out.println();
		System.out.println("Maintenant trié du plus grand au plus petit grace à la methode compareTo");
		System.out.println();
		Arrays.sort(maBibli);
		for (Livre livre : maBibli) {
			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
		}
		
		
		
		
		// Comparaison avec COMPARATOR
		System.out.println();
		System.out.println("Comparaison avec COMPARATOR pour le NbPages");
		System.out.println();
		List <Livre> maBibliArrayList = new ArrayList<>();
		maBibliArrayList.add(monLivre1);
		maBibliArrayList.add(monLivre2);
		maBibliArrayList.add(monLivre3);
		maBibliArrayList.add(monLivre4);
		maBibliArrayList.add(monLivre5);
		maBibliArrayList.add(monLivre6);
		maBibliArrayList.add(monLivre7);
		
		TriParNbPagesComparator triParNbPagesComparator = new TriParNbPagesComparator();
		maBibliArrayList.sort(triParNbPagesComparator);	
		for (Livre livre : maBibliArrayList) {
			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
			
		}
		System.out.println();
		System.out.println("Comparaison avec COMPARATOR pour la taille du titre");
		System.out.println();
		TriParTailleTitreComparator triParTailleTitreComparator = new TriParTailleTitreComparator();
		maBibliArrayList.sort(triParTailleTitreComparator);
		for (Livre livre : maBibliArrayList) {
			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
			
		}
		
		System.out.println();
		System.out.println("Comparaison avec COMPARATOR avec le prix");
		System.out.println();
		TriParPrixComparator triParPrixComparator = new TriParPrixComparator();
		maBibliArrayList.sort(triParPrixComparator);
		for (Livre livre : maBibliArrayList) {
			System.out.println(livre.getTitre() + " de " + livre.getAuteur()+ " a " + livre.getNbPages() + " pages");
			
		}
		
///////////////////////////		
		
//      5. Comparator vs Comparable
//      The Comparable interface is a good choice to use for defining the default ordering, or in other words, if it's the main way of comparing objects.
//
//      So why use a Comparator if we already have Comparable?
//
//      There are several reasons why:
//
//      Sometimes we can't modify the source code of the class whose objects we want to sort, thus making the use of Comparable impossible
//      Using Comparators allows us to avoid adding additional code to our domain classes
//      We can define multiple different comparison strategies, which isn't possible when using Comparable


///////////////////////
		
		
		
		
		// Test livre TpObjet05 avec le typeDeDonnee
		System.out.println();
		for (Livre livre : maBibliArrayList) {
			System.out.println(livre.getAnneeParution().getAnnee());
			
		}
		
		
		
		
		
		

	}

	
	
	
}
