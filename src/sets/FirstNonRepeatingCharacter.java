package sets;

import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		char[] chars = { 'a', 'c', 'a', 'c', 'd', 'b', 'e','b', 'f', 'a', 'e', 'c' };
		Map<Character, Integer> charCountMap = new TreeMap<Character, Integer>();

		for (Character c : chars) {
			if (charCountMap.get(c) == null) {
				charCountMap.put(c, 1);
			} else {
				int count = charCountMap.get(c);
				charCountMap.put(c, count + 1);
			}
		}

		for (Character c : charCountMap.keySet()) {
			System.out.println(c + "   " + charCountMap.get(c));
		}
		System.out.println("==================");

		boolean firstNonRepeatedFound = false;
		for (Character c : charCountMap.keySet()) {

			if (firstNonRepeatedFound && charCountMap.get(c) == 1) {
				System.out .println("This character is the second non repeating character  =>" + c);
				break;
			}

			if (charCountMap.get(c) == 1) {
				firstNonRepeatedFound = true;
			}
		}
	}
}
