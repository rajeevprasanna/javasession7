package genericExample2;

import genericAPI.Animal;
import genericAPI.Dog;

//https://gist.github.com/rajeevprasanna/9564249
public class AnimalHolder<T extends Animal> { // use "T" instead
	// of "?"
	T animal;

	public static void main(String[] args) {
		AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>(); // OK
		//AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!
	}
}
