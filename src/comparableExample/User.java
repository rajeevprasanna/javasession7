package comparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User { // implements Comparable {

	private String firstName;

	public User(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	/*@Override
	public int compareTo(Object o) {
		if (o instanceof User && o != null) {
			User o1 = (User) o;
			return -1 * (o1.firstName.compareTo(this.firstName));
		} else
			return -1;
	}
	*/

	public static void main(String[] args) {
		User u1 = new User("rajiv");
		User u2 = new User("kumar");
		User u3 = new User("neelesh");
		User u4 = new User("jitendra");
		List<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		System.out.println("before sorting ==============");
		printListElements(userList);
		//Collections.sort(userList);
		Collections.sort(userList, new DescendingComparator());
		System.out.println("after sorting ==============");
		printListElements(userList);
	}
	
	static class DescendingComparator implements Comparator<User> {
		@Override
		public int compare(User u1, User u2) {			 			
				return  (u1.firstName.compareTo(u2.firstName));			 
		}
	}

	private static void printListElements(List<User> userList) {
		for (User u : userList) {
			System.out.println(u.getFirstName());
		}
	}

}
