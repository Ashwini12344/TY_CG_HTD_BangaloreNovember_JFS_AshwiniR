package exceptionpropagtion;

public class B {
	static void m() throws ClassNotFoundException {
		C.n();
	}

}
