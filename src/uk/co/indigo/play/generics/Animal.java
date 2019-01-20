package uk.co.indigo.play.generics;

import java.util.Collection;

public abstract class Animal {

	// signature specifies that the animal can play
	// with anything that is or extends the Animal superclass
	public void playWith(Collection<? extends Animal> playGroup) {
		
	}
}
