
public class TestA {
	public static void main(String[] args) {
		//Boxing
		int i1=10;
		Integer i2=new Integer(i1);
		
		double d1=34.33;
		Double d2=new Double(d1);
		//unboxing
		int i3=i2.intValue();
		System.out.println(i3);
		System.out.println(i2);
		System.out.println(i1);
	}

}
