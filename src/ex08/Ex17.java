package ex08;

import tools.P;

class D {
	private class P1 implements PI {
		public void m1() {
			P.lnrint("m1");
		}
	}

	PI getRef() {
		return new P1();
	}

	P1 getRef2() {
		return new P1();
	}

}

public class Ex17 {

	public static void main(String[] args) {
		D d = new D();
		PI pi = d.getRef();
		PI pi2 = d.getRef2();
//		P1 a = d.getRef2();
	}

}
