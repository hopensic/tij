package ex09;

import tools.E;
import tools.P;

class AbortedConstruction extends Exception {
	public AbortedConstruction() {
		super("Constrution aborted");
	}
}

class WithDispose {
	private boolean constructed = false;

	public WithDispose(boolean abort) throws AbortedConstruction {
		if (abort)
			throw new AbortedConstruction();
		P.lnrint("After exception");
		constructed = true;
	}

	public void dispose() {
		System.out.println("constructed = " + constructed);
		if (constructed == true)
			System.out.println("Cleaning up");
		else
			System.out.println("Constructor didn't finish,"
					+ " not cleaning up");
	}
}

public class Ex15 {

	public static void main(String[] args) {
		WithDispose wc = null;
		try {
			wc = new WithDispose(false);
		} catch (AbortedConstruction e) {
			E.lnrint("Caught " + e);
		} finally {
			P.lnrint("In finally 1 , preparing to clean up");
			wc.dispose();
		}
//		wc = null;
		try {
			try {
				wc = new WithDispose(true);
			} catch (AbortedConstruction e) {
				E.lnrint("Caught exception " + e);
			} finally {
				P.lnrint("In finally 2 , preparing to clean up");
				wc.dispose();
			}
		} catch (Exception e) {
			E.lnrint("Caught exception " + e);
		}

	}

}
