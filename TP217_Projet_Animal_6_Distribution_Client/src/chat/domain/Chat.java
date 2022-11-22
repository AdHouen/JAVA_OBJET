package chat.domain;

import animal.domain.Mamifere;

public class Chat extends Mamifere {

	public Chat() {
		super();

	}

	public Chat(String nom) {
		super(nom);

	}

	@Override
	public void parle() {
		System.out.println(getNom() + " parle : miou miou");
		
		
	}

	@Override
	public String toString() {

		return "Je suis un chat de nom " + getNom();
	}

	public static void main(String[] args) {

		Chat felixChat = new Chat("Félix");
		
		System.out.println(felixChat);
		
		
		
		
		
		
			

	}
}
