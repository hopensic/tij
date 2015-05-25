package ch09;

import tools.E;
import tools.P;

class SimpleException extends Exception {

}

public class SimpleExceptionDemo {
	public void f() throws SimpleException {
		P.lnrint("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		SimpleExceptionDemo sed = new SimpleExceptionDemo();

		try {
			sed.f();
		} catch (SimpleException e) {
			E.lnrint("Caught it!");
		}
	}

}
