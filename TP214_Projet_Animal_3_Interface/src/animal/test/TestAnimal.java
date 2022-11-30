package animal.test;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;



import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;
import animal.domain.Mammiferes;
import animal.domain.Nommable;


public class TestAnimal {
	
	public static void main(String[] args) {
		
		// Affichage avec la question 2
		System.out.println("Affichage avec la question 2");
		System.out.println();
		
		
		Animal [] animaux = new Animal [3];
		animaux [0] = new Animal ("Truc");
		animaux [1] = new Chien ("Médor");
		animaux [2] = new Homme ("Robert");
		
		for (int i = 0; i < animaux.length; i++) {
			System.out.println(animaux[i]);
			
		}
		
		// Question 2 
		
		boolean test1 =  animaux [2] instanceof Homme;
		boolean test2 =  animaux [2] instanceof Chien;
		boolean test3 =  animaux [2] instanceof Mammiferes;
		
		System.out.println();
		System.out.println("Question 2");
		System.out.println(test1);
		System.out.println();
		System.out.println(test2);
		System.out.println();
		System.out.println(test3);
		
		boolean test4 =  animaux [2] instanceof Animal;
		System.out.println();
		System.out.println(test4);
		
		
		// Question 5 
		System.out.println();
		System.out.println("Question 5");
		
		for(Animal var : animaux) {
			System.out.print(var.getNom()+ "  parle : "); 
			var.parle();
		}
		
		// Question 6
		
		boolean test5 = animaux [2] instanceof Nommable;
		System.out.println();
		System.out.println("Question 6");
		System.out.println(test5);
		
		
		// Question 7
		
		System.out.println();
		System.out.println("Question 7");
		
		Nommable [] nommables = new Nommable [3];
		nommables [0] = new Animal ("Truc");
		nommables [1] = new Chien ("Médor");
		nommables [2] = new Homme ("Robert");
		
		for (int i = 0; i < animaux.length; i++) {
			((Animal) nommables[i]).parle();
			
		}
		
		// Question 9.1
		
		boolean test6 = animaux [2] instanceof Comparable<Animal>;
		System.out.println();
		System.out.println("Question 9.1");
		System.out.println(test6);
		
		Chien robertChien = new Chien("Robert");
		
		
		// Suite Question 9.1
		System.out.println("Suite Question 9.1");
		System.out.println(robertChien.compareTo(animaux[2]));
		
		
		// Question 9.2
		System.out.println();
		System.out.println("Suite Question 9.2");
		List<Animal> animauxComparables = new ArrayList<>();
		animauxComparables.add(new Chien("Médor"));
		animauxComparables.add(new Chien("Topaz"));
		animauxComparables.add(new Chien("Opal"));
		animauxComparables.add(new Chien("Doggy"));
		animauxComparables.add(new Homme("Adrien"));
		animauxComparables.add(new Homme("Monique"));
		animauxComparables.add(new Homme("Philippe"));
		animauxComparables.add(new Homme("Robert"));
		
		
//		animauxComparables.forEach(System.out::println);

        for (Animal animal : animaux) {
            animal.parle();
        }
		
		
     // Question 9.3
 		System.out.println();
 		System.out.println("Suite Question 9.3");
 		System.out.println();
 		System.out.println("Tableau trier dans l'ordre croissant : ");
 		Collections.sort(animauxComparables);
 		animauxComparables.forEach(System.out::println);
 		System.out.println();
 		System.out.println("Tableau trier dans l'ordre décroissant : ");
 		Collections.reverse(animauxComparables);
 		animauxComparables.forEach(System.out::println);
 		
 		
 		// Question 10 
 		
 		System.out.println();
 		System.out.println("Suite Question 10");
 		System.out.println();
 		boolean test7 = animaux [0] instanceof Serializable;
 		boolean test8 = animaux [1] instanceof Serializable;
 		System.out.println(test7);
 		System.out.println(test8);
 	
	
		
	
		
		
			
				
		
		
	}

}
