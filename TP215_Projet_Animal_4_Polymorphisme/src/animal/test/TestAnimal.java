package animal.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;



public class TestAnimal {
	
	public static void main(String[] args) {
		
			
		// Question 2
		
		Animal [] animaux = new Animal [2];
		animaux [0] = new Chien ("Médor");
		animaux [1] = new Homme ("Robert");
		
		for (int i = 0; i < animaux.length; i++) {
			System.out.println(animaux[i]);
			
		}
		
		// Question 5.1
		
		System.out.println();
		System.out.println("Question 5.1");
		List <Animal> animauxList = new ArrayList<>();
		animauxList.add(new Chien ("Médor"));
		animauxList.add(new Homme ("Robert"));
		
		for (Animal animal : animauxList) {
            animal.parle();
        }
		
		// Question 5.2
		
		System.out.println();
		System.out.println("Question 5.2");
		System.out.println("Tableau trier dans l'ordre croissant : ");
 		Collections.sort(animauxList);
 		animauxList.forEach(System.out::println); // OU
// 		animauxList.forEach(x->System.out.println(x)); 
 		System.out.println();
 		System.out.println("Tableau trier dans l'ordre décroissant : ");
 		Collections.reverse(animauxList);
 		animauxList.forEach(x->System.out.println(x));
		
			
				
		
		
	}

}
