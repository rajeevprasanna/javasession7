package objectExamples;

/*
 * 
 Here's what could happen using code like the preceding example:
 1. Giveanobjectsomestate(assignvaluestoitsinstancevariables).
 2. PuttheobjectinaHashMap,usingtheobjectasakey.
 3. Save the object to a file using serialization without altering any of its state.
 4. Retrievetheobjectfromthefilethroughdeserialization.
 5. Usethedeserialized(broughtbacktolifeontheheap)objecttogetthe object out of the HashMap.


 Oops. The object in the collection and the supposedly same object brought back to life are no longer identical. The object's transient variable will come
 back with a default value rather than the value the variable had at the time it was saved (or put into the HashMap). 
 */
public class SaveMe {

	transient int x;
	int y;

	SaveMe(int xVal, int yVal) {
		x = xVal;
		y = yVal;
	}

	public int hashCode() {
		return (x ^ y);// Legal, but not correct to
		// use a transient variable
	}

	public boolean equals(Object o) {
		SaveMe test = (SaveMe) o;
		if (test.y == y && test.x == x) { // Legal, not correct
			return true;
		} else {
			return false;
		}
	}
	/*
	 * So using the preceding SaveMe code, if the value of x is 9 when the
	 * instance is put in the HashMap, then since x is used in the calculation
	 * of the hashcode, when the value of x changes, the hashcode changes too.
	 * And when that same instance of SaveMe is brought back from
	 * deserialization, x == 0, regardless of the value of x at the time the
	 * object was serialized. So the new hashcode calculation will give a
	 * different hashcode, and the equals() method fails as well since x is used
	 * to determine object equality.
	 */
}
