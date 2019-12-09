package exceptionpropagtion;

public class D {
	static void o() throws ClassNotFoundException {
		Class.forName("exceptionpropagtion.A");
	}

}
