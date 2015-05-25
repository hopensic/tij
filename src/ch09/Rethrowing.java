package ch09;

import tools.E;
import tools.P;

public class Rethrowing {
	public static void f() throws Exception {
		P.lnrint("originating the exception in f() ");
		throw new Exception("thrown from f()");
	}

	public static void g() throws Throwable {
		try {
			f();
		} catch (Exception e) {
			E.lnrint("Inside g(),e.printStackTrace()");
			e.printStackTrace();
			// throw e;
			throw e.fillInStackTrace();
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			g();
		} catch (Exception e) {
			E.lnrint("Caught in main, e.printStackTrace()");
			e.printStackTrace();

		}

	}
}
