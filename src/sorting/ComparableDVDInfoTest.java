package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://gist.github.com/rajeevprasanna/9443312
public class ComparableDVDInfoTest {
	public static void main(String[] args) {
		List<DVDInfo> dvdList = new ArrayList<DVDInfo>();		
		populateList(dvdList); // adds the file data to the ArrayList
		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println(dvdList);
	}		

	private static void populateList(List<DVDInfo> dvdList) {
		for (int i = 0; i < 10; i++) {
			String s = i + "  ";
			dvdList.add(new DVDInfo(s, s, s));
		}
	}	 
}
