package generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctor {

	public static void main(String[] args) {
		checkForArrays();
		checkForList();
		superUse();
		wildCardDeclarations();
	}

	private static void wildCardDeclarations() {
		List<?> list = new ArrayList<Dog>();
		List<? extends Animal> aList = new ArrayList<Dog>();
		
		// You cannot assign an Integer list to a reference that takes only a
		// Dog (including any subtypes of Dog, of course).
		//List<? extends Dog> cList = new ArrayList<Integer>();
		List<? super Dog> bList = new ArrayList<Animal>();
		
		// you cannot use wildcard notation in the object creation. So the new
		// ArrayList<? extends Animal>() will not compile.
		//List<?> foo = new ArrayList<? extends Animal>();
		
		// You cannot assign a Dog to <? super Animal>. The Dog is too "low"
		//in the class hierarchy. Only <Animal> or <Object> would have been legal.
		//List<? super Animal> dList = new ArrayList<Dog>();
	}

	private static void superUse() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
		AnimalDoctor doc = new AnimalDoctor();
		doc.addAnimal(animals);
	}

	// Hey compiler, please accept any List with a generic type that is of type
	// Dog, or a supertype of Dog. Nothing lower in the inheritance tree can
	// come in, but anything higher than Dog is OK."
	public void addAnimal(List<? super Dog> animals) {
		animals.add(new Dog()); // adding is sometimes OK with super
	}

	private static void checkForList() {
		// make ArrayLists instead of arrays for Dog, Cat, Bird
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());

		// this code is the same as the Array version
		AnimalDoctor doc = new AnimalDoctor();
		// this worked when we used arrays instead of ArrayLists
		// Below code gives compilation error
		// doc.checkAnimals(dogs); // send a List<Dog>
		// doc.checkAnimals(cats); // send a List<Cat>
		// doc.checkAnimals(birds); // send a List<Bird>

		// You can do the same thing with generics:
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat()); // OK
		animals.add(new Dog()); // OK

		// The compiler thinks it is perfectly fine to add a Dog to an Animal[]
		// array, since a Dog can be assigned to an Animal reference. The
		// problem is, if you passed in an array of an Animal subtype (Cat, Dog,
		// or Bird), the compiler does not know. The compiler does not realize
		// that out on the heap somewhere is an array of type Cat[], not
		// Animal[], and you're about to try to add a Dog to it. To the
		// compiler, you have passed in an array of type Animal, so it has no
		// way to recognize the problem.

	}

	public void checkAnimals(ArrayList<Animal> animals) {
		// public void checkAnimals(List<? extends Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}

	public void checkAnimal(Animal a) {
		a.checkup(); // does not matter which animal subtype each
						// Animal's overridden checkup() method runs
	}

	public void checkAnimals(Animal[] animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}

	private static void checkForArrays() {
		// test it
		Dog[] dogs = { new Dog(), new Dog() };
		Cat[] cats = { new Cat(), new Cat(), new Cat() };
		Bird[] birds = { new Bird() };
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs); // pass the Dog[]
		doc.checkAnimals(cats); // pass the Cat[]
		doc.checkAnimals(birds); // pass the Bird[]
	}

}
