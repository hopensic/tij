package ex08;

import tools.P;

interface A {
	void m1();
}

interface B {
	void m1();
}

interface C {
	void m1();
}

public class Ex13 {
	A test() {
		class Inner implements A {
			public void m1() {
				P.lnrint("aaaaa");
			}
		}
		return new Inner();
	}

	B test2() {
		{
			class Inner implements B {
				public void m1() {
					P.lnrint("bbbb");
				}
			}
			return new Inner();
		}

	}

	C test3() {
		return new C() {
			public void m1() {
				P.lnrint("cccccc");
			}
		};
	}

	public static void main(String[] args) {
		Ex13 ex13 = new Ex13();
		ex13.test3().m1();
	}

}
