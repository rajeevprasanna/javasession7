package sorting;

import java.util.ArrayList;
import java.util.Collections;

//https://gist.github.com/rajeevprasanna/9443405
public class ComparatorSortExample {
	
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();

	public static void main(String[] args) {
		new ComparatorSortExample().go();
	}

	public void go() {
		populateList();
		System.out.println(dvdlist);
		Collections.sort(dvdlist);
		System.out.println(dvdlist);
		GenreSort gs = new GenreSort();
		Collections.sort(dvdlist, gs);
		System.out.println(dvdlist);
	}

	private void populateList() {
		for (int i = 0; i < 10; i++) {
			String s = i + "  ";
			dvdlist.add(new DVDInfo(s, s, s));
		}
	}	
}