package ch09;

import tools.E;
import tools.P;

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class RethrowNew {
	public static void f() throws OneException {
		P.lnrint("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public static void main(String[] args) throws TwoException {
		try {
			f();
		} catch (OneException e) {
			E.lnrint("Caught in main, e.printStackTrace()");
			e.printStackTrace();
			throw new TwoException("from main()");
		}
	}
}
