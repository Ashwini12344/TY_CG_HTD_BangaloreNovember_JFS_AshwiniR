package looseCoupling;

public class TestCrush {
	public static void main(String[] args) {
		Crush c1=new Crush();
		BasicSet b1=new BasicSet();
		Apple a1=new Apple();
		Oppo o=new Oppo();
		OnePlus o1=new OnePlus();
		c1.receive(o1);
	}

}
