package ch06;

import tools.P;

class WithFinals {
	private final void f() {
		P.lnrint("WithFinals.f()");
	}

	private void g() {
		P.lnrint("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		P.lnrint("OverridingPrivate.f()");
	}

	private void g() {
		P.lnrint("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		P.lnrint("OverridingPrivate2.f()");
	}

	public void g() {
		P.lnrint("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		
		OverridingPrivate op = new OverridingPrivate();
//		op.f();
	}

}
