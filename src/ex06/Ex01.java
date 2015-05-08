package ex06;

import tools.P;

class A {
	A() {
		P.lnrint("AAA");
	}
}

class B {
	B() {
		P.lnrint("BBB");
	}
}

class C extends A {
	private B b = new B();

}

public class Ex01 {

	public Ex01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new C();
	}

}
