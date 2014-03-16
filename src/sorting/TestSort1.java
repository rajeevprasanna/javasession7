package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		/*Collections.sort(stuff);
		System.out.println("==============");
		System.out.println("sorted " + stuff);
		*/
		System.out.println("==============comparator sorting ===========");
		Collections.sort(stuff, new DescendingComparator());
		System.out.println("descending sorted " + stuff);
	}

	static class DescendingComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (s1.charAt(1) > s2.charAt(1)) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
