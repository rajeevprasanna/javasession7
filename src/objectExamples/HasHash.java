package objectExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//https://gist.github.com/rajeevprasanna/9442519
public class HasHash {
	
	private int x;
	Random randomGenerator = new Random();
	String name;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getx(){
		return x;
	}

	HasHash(int x, String name) {
		this.x = x;
		this.name = name;
	}

	
	public boolean equals(Object o) {
		System.out.println("equals method is invoked");
		HasHash h = (HasHash) o; // Don't try at home without
		if (h.x == this.x) {
			return true;
		} else {
			return false;
		} 		
	}
	
	//100 objects... key is primary key
	// map = > key, value
	//key = 100 value xyg
	//key 100 value 220
	
	// m1  => 0 to 25
	// m2   => 26 to 50

	/*public int hashCode() {
		System.out.println("hash code method is invoked");
		int y =  randomGenerator.nextInt();
		System.out.println("random value is  => "+ y);
		return y;
	}
	*/
	//b1 => 0 to 100
	
	public static void main(String[] args){ 	
		Map<String, HasHash> map = new HashMap<String, HasHash>();
		 
			HasHash h1  = new HasHash(1, "rajiv");					
			map.put(h1.getName(), h1);
			
			HasHash h2  = new HasHash(2, "jitendra");					
			map.put(h2.getName(), h2);
			
			HasHash h3  = new HasHash(3, "neelesh");					
			map.put(h3.getName(), h3);			
			 
			HasHash re = map.get(h3.getName());
			System.out.println(h3);
			System.out.println(re);
			
			System.out.println(map.size());
			printH3(map);
	}
	
	public static void printH3(Map<String, HasHash> map){
		System.out.println("-----------");
		//verify map contains h3 or not
		HasHash h3  = new HasHash(3, "neelesh");
		HasHash re = map.get(h3.getName());
		System.out.println(h3);
		System.out.println(re);
	}
}
