package sets;

import java.util.*;
public class HashSetExample {
	public static void main(String[] args){
		//refer :http://docs.oracle.com/javase/6/docs/api/java/util/TreeSet.html
		//hashSetExample();
		//linkedHashSetExample();
		//treeSetExample();
		treeSetWithComparator();
	}
	
	private static void treeSetWithComparator() {
		//it removes duplicate elements
		//It stores the elements in sorting order as per the comparator.
		Set<Integer> stringSet = new TreeSet<Integer>(new AscendingComparator());
		stringSet.add(null);
		stringSet.add(100);	
		stringSet.add(1);
		stringSet.add(2);
		stringSet.add(21);
		stringSet.add(3);
		stringSet.add(1);
		stringSet.add(3);
		stringSet.add(4);
						 
		printSetElements(stringSet);			
	}
	
	//List<user>
	// sort based on first -> api1
	// sort based on last name => api2
	// sort based on salary = api3
	
	
	static class DescendingComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 == null || o2 == null)
				return -1;

			if (o1 < o2) {
				return 1;
			} else if (o1 == o2) {
				return 0;
			} else {
				return -1;
			}
		}
	}
	
	static class AscendingComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 == null || o2 == null)
				return -1;

			if (o1 > o2) {
				return 1;
			} else if (o1 == o2) {
				return 0;
			} else {
				return -1;
			}
		}
	}

	
	private static void treeSetExample() {
		//it removes duplicate elements
		//It stores the elements in sorting order. It maintains natural ordering. You will retrieve elements in sorted order
		Set<Integer> stringSet = new TreeSet<Integer>();
		//stringSet.add(null);
		stringSet.add(100);	
		stringSet.add(1);
		stringSet.add(2);
		stringSet.add(21);
		stringSet.add(3);
		stringSet.add(1);
		stringSet.add(3);
		stringSet.add(4);				
		printSetElements(stringSet);			
	}

	

	
	private static void linkedHashSetExample() {
		//it removes duplicate elements
		//It  maintains order of insertion in storing the elements. So you will get elements in insertion order.
		Set<Integer> stringSet = new LinkedHashSet<Integer>();
		stringSet.add(null);
		stringSet.add(100);	
		stringSet.add(1);
		stringSet.add(2);
		stringSet.add(3);
		stringSet.add(1);
		stringSet.add(3);
		stringSet.add(4);				
		printSetElements(stringSet);			
	}
	
	private static void hashSetExample() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(100);
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(3);
		integerSet.add(1);
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(null);
		//it removes duplicate elements
		//It will not maintain any order in storing the elements. So you will get elements in random order.
		printSetElements(integerSet);		
	}

	
	
	

	private static void printSetElements(Set<Integer> stringSet) {
		 if(stringSet != null){
			 for(Integer s: stringSet){
				 System.out.println(s);
			 }
		 }		
	}
	
	
}
