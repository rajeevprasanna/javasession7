
class Dog {
	public Dog(String n) {
		name = n;
	}

	public String name;

	public boolean equals(Object o) {
		if ((o instanceof Dog) && (((Dog) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.length();
	}	
}
