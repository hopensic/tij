package ch09;

import tools.E;
import tools.P;

class ThreeException extends Exception {

}

public class FinallyWorks {
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0)
					throw new ThreeException();
				P.lnrint("No exception");
			} catch (ThreeException e) {
				E.lnrint("ThreeException");
			} finally {
				E.lnrint("In finally clause");
				if (count == 2)
					break;
			}
		}
	}

}
