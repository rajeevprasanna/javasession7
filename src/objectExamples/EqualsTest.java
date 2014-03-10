package objectExamples;

//https://gist.github.com/rajeevprasanna/9442489
public class EqualsTest {
	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		 		
		Moof three = null;
		if(three.equals(one)){
			System.out.println("one and two are equal");
		}else{
			System.out.println("not equal");
		}
		
	}
}
