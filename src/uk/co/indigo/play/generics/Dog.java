package uk.co.indigo.play.generics;

import java.util.Collection;

public class Dog extends Animal {

	// signature specifies that the dog can play
	// with anything that is or extends the Animal superclass
	public void playWith(Collection<? extends Animal> playGroup) {
		
	}
}
