package animal.test;

import java.util.Arrays;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		// Affichage avec la question 2
		System.out.println("Affichage avec la question 2");
		System.out.println();
		
		
		Animal [] animaux = new Animal [5];
		animaux [0] = new Animal ("Truc");
		animaux [1] = new Animal ();
		animaux [2] = new Chien ("Médor");
		animaux [3] = new Homme ();
		animaux [4] = new Homme ("Robert");
		
		for (int i = 0; i < animaux.length; i++) {
			System.out.println(animaux[i]);
			
		}
		
		System.out.println();
		
		// Affichage avec la question 4
		
		System.out.println("Affichage avec la question 4");
		System.out.println();
		
		Animal [] animaux2 = { new Animal ("Truc"), new Animal (), new Chien ("Médor"), new Homme (), new Homme ("Robert")};
		for (Animal animal : animaux2) {
			System.out.println(animal);
			
		}
		System.out.println();
		
		// Affichage avec la question 6
		
		System.out.println("Affichage avec la question 6");
		System.out.println();
		
		Animal [] animaux3 = { new Animal ("Truc"), new Animal (), new Chien ("Médor"), new Homme (), new Homme ("Robert")};
		Arrays.asList(animaux3).forEach(x-> System.out.println(x));
		
		
			
				
		
		
	}

}
