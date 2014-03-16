package generics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class GenericsLegacyCode {
	public static void main(String[] args) {
		simpleLegacyCodeComparison();
		testBadLegacy();
		invalidGenericsUse();
	}

	private static void invalidGenericsUse() {
		// In other words, polymorphism applies here to only the "base" type.
		// And by "base," we mean the type of the collection class itself the
		// class that can be customized with a type.

		// List<Object> myList = new ArrayList<JButton>(); //NO
		// List<Number> numbers = new ArrayList<Integer>(); //NO

		List<JButton> myList1 = new ArrayList<JButton>(); // yes
		List<Object> myList2 = new ArrayList<Object>(); // yes
		List<Integer> myList3 = new ArrayList<Integer>(); // yes
	}

	private static void testBadLegacy() {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList); // pass List<Integer> to legacy code
	}

	static class Inserter {
		// method with a non-generic List argument
		void insert(List list) {
			list.add(new Integer(42)); // adds to the incoming list

			// Keep in mind, then, that the problem of putting the wrong thing
			// into a typed (generic) collection does not show up at the time
			// you actually do the add() to the collection. It only shows up
			// later, when you try to use something in the list and it doesn't
			// match what you were expecting

			// But...what if we modify the insert() to list.add(new
			// String("42"));
			// Can't we enforce it to hold just integers ?
			// Supposedly type safe ArrayList of type <Integer>. How can that
			// be?
		}
	}

	private static void simpleLegacyCodeComparison() {
		// Legacy implementation
		List myList = new ArrayList();
		myList.add(1);
		myList.add(2);
		// Below can throw exception if it contains anything other than Integer
		Integer i = (Integer) myList.get(0);// Typecase required

		// New implementation
		List<Integer> myList2 = new ArrayList<Integer>();
		myList2.add(1);
		myList2.add(2);
		Integer i2 = myList2.get(0);// No need of typecast.
	}

}
