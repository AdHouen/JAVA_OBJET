package chat.test;

import java.util.ArrayList;
import java.util.List;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;
import chat.domain.Chat;

public class TestChat {

	public static void main(String[] args) {
		
		List <Animal> animauxList = new ArrayList<>();
		animauxList.add(new Animal ("Truc"));
		animauxList.add(new Chien ("Médor"));
		animauxList.add(new Homme ("Robert"));
		animauxList.add(new Chat("Félix"));
		
		for (Animal animal : animauxList) {
            System.out.println(animal);
        }
		
		System.out.println();
		System.out.println("Question 3.1 ");
		System.out.println();
		
		for (Animal animal : animauxList) {
            animal.parle();
        }
	}
}
