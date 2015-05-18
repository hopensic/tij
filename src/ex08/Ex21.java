package ex08;

import tools.P;

public class Ex21 {
	static class Inner {
		private int a;

		Inner(int i) {
			a = i;
		}

		void p() {
			P.lnrint(a);
		}

	}

	public static void main(String[] args) {
		Inner i = new Inner(3);
		i.p();
	}

}

class AAA {
	void a() {
		Ex21.Inner a = new Ex21.Inner(3);
	}
}
