package lists;

public class TestList {
	private int x;

	public TestList(int x) {
		this.x = x;
	}

	public int getx() {
		return this.x;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof TestList && ((TestList) o).getx() == this.getx())
			return true;
		else {
			return false;
		}
	}
	
	public static void main(String[] args){
		TestList t = new TestList(0);
		System.out.println(t.hashCode());
		System.out.println(t);
	}
}
