package sorting;

import java.util.ArrayList;
import java.util.Collections;

//https://gist.github.com/rajeevprasanna/9443244
class TestSort1 {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>();  
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff); // #2 System.out.println("sorted " + stuff);
	}
}
