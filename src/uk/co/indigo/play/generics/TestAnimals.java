package uk.co.indigo.play.generics;

import java.util.ArrayList;
import java.util.Collection;

public class TestAnimals {

	public static void main(String[] args) {
		
		Collection<Dog> dogs = new ArrayList<Dog>();
		Dog aDog = new Dog();
		aDog.playWith(dogs);
		
		Collection<Dog> dogs2 = new ArrayList<Dog>();
		copy(dogs, dogs2);
		
		Collection<Animal> animals = new ArrayList<Animal>();
		// this copy wont work unless lower bounds are spec-
		// ified in the copy() signature.
		copy(dogs, animals);
		
	}
	
	// signature specifies lower bounds for dog
	// meaning Dog or a superclass of Dog (Animal)
	public static void copy(Collection<Dog> from, Collection<? super Dog> to) {
		System.out.println("Copied");
	}
	
	// this method could also be written using generic E
	//public static <E> void copy(Collection<E> from, Collection<? super E> to) {
	//	
	//}

}
