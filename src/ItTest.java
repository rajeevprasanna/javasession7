import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//https://gist.github.com/rajeevprasanna/9443849
public class ItTest {
	public static void main(String[] args) {
		iterateExample();
		setExample();
		mapExample();
	}

	enum Pets {
		DOG, CAT, HORSE
	}

	private static void mapExample() {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko")); // add some key/value pairs
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover"); // let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
	}

	public static class Cat {
	}

	private static void setExample() {
		boolean[] ba = new boolean[5];
		Set s = new HashSet();
		// Set s = new TreeSet();
		// insert code here
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		for (int x = 0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println("\n");
		for (Object o : s)
			System.out.print(o + " ");

	}

	private static void iterateExample() {
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("magnolia"));
		Iterator<Dog> i3 = d.iterator();
		while (i3.hasNext()) {
			Dog d2 = i3.next(); // cast not required
			System.out.println(d2.name);
		}
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		d.remove(2);
		Object[] oa = d.toArray();
		for (Object o : oa) {
			Dog d2 = (Dog) o;
			System.out.println("oa " + d2.name);
		}
	}
}
