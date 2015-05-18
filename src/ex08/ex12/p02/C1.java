package ex08.ex12.p02;

import tools.P;
import ex08.ex12.p01.I1;

public class C1 {
	protected int i=0;
	
	protected class InnerClass1 implements I1 {
		public InnerClass1() {

		}

		public void m1() {
			P.lnrint("AAA");
		}
	}

	public static void main(String[] args) {
		C1 c1 = new C1();
	}

}
