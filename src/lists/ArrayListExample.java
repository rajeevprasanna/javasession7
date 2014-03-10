package lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://gist.github.com/rajeevprasanna/9443211
public class ArrayListExample {
	 
	public static void main(String[] args) {	 
		
		List<TestList> testList = new ArrayList<TestList>();		
		TestList t1 = new TestList(1);
		TestList t2 = new TestList(2);
		TestList t3 = new TestList(3);
		TestList t4 = new TestList(4);
		TestList t5 = new TestList(5);
		
		testList.add(t1);
		testList.add(t2);
		testList.add(t3);
		testList.add(t4);
		testList.add(t5);
		
		for(TestList t : testList){
			System.out.println(t.getx());
		}				
		
		Map map = new HashMap();
		map.put(t1.getx(), t1);
		map.remove(t1.getx());
		
		boolean contains = testList.contains(t1);
		containsInList(testList);
		//System.out.println(contains);
	}
	
	public static void containsInList(List<TestList> testList){
		TestList t1 = new TestList(1);
		boolean contains = testList.contains(t1);
		System.out.println(contains);
	}
}
