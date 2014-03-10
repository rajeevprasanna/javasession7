package objectExamples;

//https://gist.github.com/rajeevprasanna/9442386
public class HardToRead {
	public static void main(String[] args) {
		HardToRead h = new HardToRead();

		// Below two methds print the same output
		System.out.println(h);
		System.out.println(h.toString());

		// But first approach is always better as second will throw exception if
		// h is null
	}

	@Override
	public String toString() {
		//HardToRead [getClass()=class objectExamples.HardToRead, hashCode()=1079268934, toString()=objectExamples.HardToRead@40545646]
		return "HardToRead [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
