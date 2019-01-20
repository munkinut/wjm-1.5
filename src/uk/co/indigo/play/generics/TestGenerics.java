package uk.co.indigo.play.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;

public class TestGenerics {

	public static void main(String[] args) {
		
		// Simple use of generic Vector
		Vector<String> strings = new Vector<String>();
		strings.add("Hello");
		// demo of foreach for good measure
		for (String string : strings) {
			System.out.println(string);
		}
		
		// Generic Hashtable allows you to define the
		// key and value types
		Hashtable<Integer, String> keys = new Hashtable<Integer, String>();
		// demo of autoboxing on the Integer
		keys.put(0,"hello");
		for (int i : keys.keySet()) {
			System.out.println(i + " " + keys.get(i));
		}
		
		// Using our own generic class
		GenericTag<String> gt = new GenericTag<String>("Hello");
		System.out.println(gt.getHeader());
		
		// Using our own generic method
		genericMethod("Hello");
		
		// Using a more complex generic method
		Collection<String> in = new ArrayList<String>();
		in.add("Hello");
		Collection<String> out = genericCollection(in);
		for (String s : out) {
			System.out.println(s);
		}
	}
	
	// <T> declares that we are using a parametric type
	public static <T> void genericMethod(T in) {
		System.out.println(in);
	}
	
	// <T> as above.
	// T as return type and as parameter
	public static <T> T genericMethodReturn(T in) {
		return in;
	}
	
	// <T> as above.
	// Collection<T> indicates Collection of T types
	// as both return type and parameters
	public static <T> Collection<T> genericCollection(Collection<T> in) {
		Collection<T> out = new ArrayList<T>();
		for (T element : in) {
			out.add(element);
		}
		return out;
	}
}
