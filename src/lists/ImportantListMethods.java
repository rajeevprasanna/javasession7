package lists;

import java.util.*;
public class ImportantListMethods {
	public static void main(String[] args){
		
		//50 => 26 => 100
		int[] a = new int[4];
		a[0] = 0;
		//a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		//100 to 104
		//100 + 2(2) = 104
		// 0 - 1 - 2 - 
		a = new int[50];
		//copy previous
		a[4] = 4;
		
		
		//100 eleme
		a = new int[200];
		
		//Node => int value, int pointerTo
		//0 -> 1 -> 2  -> 4 -> 5
		List<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
	
		//heap => 100(head-> 1000) -> 1000(o2 -> 30005) -> 30005
		//hash -> o1,o2,o3 
		// hashCode(2) -> 
		
		// hash code() => 100 => o1, o2, o3, o4 etc => o1->o2->o3->04
		
		//Important list implementations
		List listA = new ArrayList(); //suited in case of :  once constructed...after that there is no manipulation of data elements
		List listB = new LinkedList(); //suited in case of :  insertion sort, rearranging elements in list etc
		List listC = new Vector(); // Legacy
		List listD = new Stack(); // first in last out
		
		mostCommonUsedListMethods();
	}

	private static void mostCommonUsedListMethods() {
		List<String> listA = new ArrayList<String>();
		listA.add("element 1");		 
		listA.add("element 2");
		listA.add("element 3");
		listA.add(0, "element 0");
		
		//Size of the list
		int size = listA.size();
		
		//Checking Index of an Item in Java Arraylist
		//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
		int index = listA.indexOf("element 1"); //location of Item object in List

		// Checking ArrayList for an Item
		// Sometimes we need to check whether an element exists in ArrayList in
		// Java or not for this purpose we can use contains () method of Java.
		// contains() method takes type of object defined in ArrayList creation
		// and returns true if this list contains the specified element.
		
				 
		//Checking if list is empty
		if(listA.isEmpty()){
		   System.out.println("ArrayList is empty");
		}
 

		//access via index
		String element0 = listA.get(0);
		String element1 = listA.get(1);
		String element3 = listA.get(2);


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		}


		//access via new for-loop
		for(String object : listA) {			 
		    String element = object;
		}
		
		
		// We can remove elements in two ways
		// 1. Remove by passing exact object to be removed -- remove(Object
		// element) => Removes the first occurrence of the specified element
		// from this list, if it is present (optional operation).
		
		// 2. Remove by passing element index -- remove(int index)
		//3. removeAll(Collection<?> c) => Removes from this list all of its elements that are contained in the specified collection (optional operation).
		listA.remove(0);  
		listA.remove("element 3");
		
		//lisA.remove(o2);
		
		// copy data from one array list to another array list
		// Many a times you need to create a copy of ArrayList for this purpose
		// you can use addAll(Collection c) method of ArrayList in Java to copy
		// all elements from on ArrayList to another ArrayList in Java
		ArrayList<String> copyOfStringList = new ArrayList<String>();		 
		copyOfStringList.addAll(listA);
		 
 
		
		//Replacing an element at a particular index
		listA.set(0,"Item2");
		
		// Clearing all data from array list : 
		// ArrayList in Java provides clear () method which removes all of the
		// elements from this list. Below code will remote all elements from our
		// listA and make the list empty. You can reuse Java ArrayList
		// after clearing it.
		listA.clear();
		
		
		// Converting from ArrayList to Array in Java
		// Java ArrayList provides you facility to get the array back from your
		// ArrayList. You can use toArray(T[] a) method returns an array
		// containing all of the elements in this list in proper sequence (from
		// first to last element). "a" is the array into which the elements of
		// the list are to be stored, if it is big enough; otherwise, a new
		// array of the same runtime type is allocated for this purpose.
		String[] itemArray = new String[listA.size()];
		String[] returnedArray = listA.toArray(itemArray);
		 
		
		
		//Creating Synchronized ArrayList
		//Some times you need to synchronize your ArrayList in java to make it shareable between multiple threads you can use Collections utility class for this purpose as shown below.
		List<String> synchronizedList = Collections.synchronizedList(listA);
 
		
		// Creating ArrayList from Array in Java
		// ArrayList in Java is amazing you can create even an ArrayList full of
		// your element from an already existing array. You need to use
		// Arrays.asList(T... a) method for this purpose which returns a
		// fixed-size list backed by the specified array.
		ArrayList<String> stringList =   (ArrayList<String>) Arrays.asList(new String[]{"One", "Two", "Three"}); //this is not read only List you can still update value of existing elements
		
		
		
		//If you want to assign empty list, use below one
		List emotyList = Collections.EMPTY_LIST;
		 		
	}
	
	public List<String> getDuplicateElements(List<String> elementList){
		
		if(elementList == null || elementList.isEmpty()){
			return Collections.EMPTY_LIST;			 
		}
		
		List<String> dupList = new ArrayList<String>();
		//business logic to get duplicate words
		//add dup word to this new list
		//duplist.add(word);
		return dupList;
	}
}
