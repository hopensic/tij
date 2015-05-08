package ex06;

import tools.P;

class A1 {
	A1(int a) {
		P.lnrint("AAA");
		P.lnrint(a);
	}
}

class B1 {
	B1(int a) {
		P.lnrint("BBB");
		P.lnrint(a);
	}
}

class C1 extends A1 {
	private B1 b;

	C1(int a) {
		super(a);
		b = new B1(a);
	}

}

public class Ex02 {

	public Ex02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new C1(11);
	}

}
