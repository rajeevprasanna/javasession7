package genericAPI;

import java.util.*;

//https://gist.github.com/rajeevprasanna/9564491
public class CreateAnArrayList {

	// it's possible to define a parameterized type at a more granular level a
	// method.
	// Imagine you want to create a method that takes an instance of any type,
	// instantiates an ArrayList of that type, and adds the instance to the
	// ArrayList. The class itself doesn't need to be generic; basically we just
	// want a utility method that we can pass a type to and that can use that
	// type to construct a type safe collection
	
	
	//The strangest thing about generic methods is that you must declare the type variable BEFORE the return type of the method:
	// public <T> void makeArrayList(T t)
//The <T> before void simply defines what T is before you use it as a type in the argument. You MUST declare the type like that unless the type is specified for the class. 

	//You're also free to put boundaries on the type you declare, for example, if you want to restrict the makeArrayList() method to only Number or
	//its subtypes (Integer, Float, and so on) you would say
  //public <T extends Number> void makeArrayList(T t)
	
	public <T> void makeArrayList(T t) { // take an object of an
											// unknown type and use a
											// "T" to represent the type
		List<T> list = new ArrayList<T>(); // now we can create the
											// list using "T"
		list.add(t);
	}

	/*
	 * In the preceding code, if you invoke the makeArrayList() method with a
	 * Dog instance, the method will behave as though it looked like this all
	 * along: public void makeArrayList(Dog t) { List<Dog> list = new
	 * ArrayList<Dog>(); list.add(t); }
	 */
}